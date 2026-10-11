#### Locks

- synchronized (this) - Intrinsic lock
- ReentrantLock
- ReentrantReadWriteLock
- StampedLock

#### Java Executor Framework

- Executors.newFixedThreadPool (int)
- Executors.newCachedThreadPool () - Creates new threads as needed and reuses available ones. Idle threads are destroyed after 60 seconds.
- Executors.newSingleThreadExecutor ()
- Executors.newScheduledThreadPool (int)
- Executors.newWorkStealingPool ()
