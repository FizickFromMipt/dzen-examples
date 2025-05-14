| Задача                  | Что использовать                                 |
| ----------------------- | ------------------------------------------------ |
| Запустить простой поток | `Thread` или `ExecutorService`                   |
| Получить результат      | `Callable + Future` или `CompletableFuture`      |
| Много мелких задач      | `ForkJoinPool` или виртуальные потоки            |
| Асинхронная цепочка     | `CompletableFuture`                              |
| Механизмы синхронизации | `synchronized`, `Lock`, `Atomic*`, `Concurrent*` |