package tuya.tedge.driver.sdk.base.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Slf4j
public class AsyncTaskExecutor {
    private final String taskName;
    private ThreadPoolExecutor threadPoolExecutorMonitor;

    public AsyncTaskExecutor(String taskName, int corePoolSize, int maximumPoolSize, int queueSize, String poolName) {
        this.taskName = taskName;
        this.threadPoolExecutorMonitor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, 600L, TimeUnit.SECONDS, new LinkedBlockingQueue(queueSize), new AsyncTaskExecutor.DiscardPolicy());
        this.threadPoolExecutorMonitor.setThreadFactory((r) -> {
            return new Thread(r, poolName + r.hashCode());
        });
    }

    public void execute(Runnable task) {
        this.threadPoolExecutorMonitor.execute(task);
    }

    public class DiscardPolicy implements RejectedExecutionHandler {
        public DiscardPolicy() {
        }

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
            log.error("The task{} of {} is rejected.", r, AsyncTaskExecutor.this.taskName);
        }
    }
}
