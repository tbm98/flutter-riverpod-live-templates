[Flutter Riverpod](https://github.com/rrousselGit/river_pod) live templates is a way to enhance the way you use Riverpod. It contains a collection of different
snippets such as `family` or `provider`.


## Snippets

### Generator syntax
| Shortcut                                              | Description                                                                                    |
|-------------------------------------------------------|:-----------------------------------------------------------------------------------------------|
| riverpodGeneratorFutureVariable                       | Create a future variable using generator                                                       |
| riverpodGeneratorAsyncNotifierProvider                | Create a AsyncNotifierProvider using generator                                                 |
| riverpodGeneratorVariable                             | Create a variable using generator                                                              |
| riverpodGeneratorNotiferProvider                      | Create a NotifierProvider using generator                                                      |


### Normal syntax
| Shortcut                | Description                                                                                    |
|-------------------------|:-----------------------------------------------------------------------------------------------|
| when                    | Use when on AsyncValue                                                                         |
| consumer                | New Consumer                                                                                   |
| consumerWidget          | New ConsumerWidget                                                                             |
| consumerStatefulWidget  | New ConsumerStatefulWidget                                                                     |
| hookConsumer            | New HookConsumer (must import [hooks_riverpod](https://pub.dev/packages/hooks_riverpod))       |
| hookConsumerWidget      | New HookConsumerWidget (must import [hooks_riverpod](https://pub.dev/packages/hooks_riverpod)) |
| changeNotifierProvider* | New ChangeNotifierProvider                                                                     |
| provider*               | New Provider                                                                                   |
| futureProvider*         | New FutureProvider                                                                             |
| streamProvider*         | New StreamProvider                                                                             |
| stateNotifier           | New StateNotifier in [state_provider](https://pub.dev/packages/state_notifier)                 |
| stateNotifierProvider*  | New StateNotifierProvider                                                                      |
| stateProvider*          | New StateProvider                                                                              |

( * ) is suffix modifier, ex: autoDispose, family