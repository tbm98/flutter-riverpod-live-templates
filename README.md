# Flutter Riverpod live templates

[Flutter Riverpod](https://github.com/rrousselGit/river_pod) live templates is a way to enhance the way you use Riverpod. It contains a collection of different
snippets such as `family` or `provider`.

![Build](https://github.com/tbm98/flutter-riverpod-live-templates/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/14641.svg)](https://plugins.jetbrains.com/plugin/14641)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/14641.svg)](https://plugins.jetbrains.com/plugin/14641)

## Installation

- Using IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "flutter riverpod snippets"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:

  Download the [latest release](https://github.com/tbm98/flutter-riverpod-live-templates/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## Requirements

[Riverpod]: https://github.com/rrousselGit/river_podRiverpod
IntelliJ based: since-build: 203 [learn more](https://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/build_number_ranges.html)


## Snippets
### Generator syntax
| Shortcut                                              | Description                                                                                    |
|-------------------------------------------------------|:-----------------------------------------------------------------------------------------------|
| riverpodGeneratorFutureVariable                       | Create a future variable using generator                                                       |
| riverpodGeneratorAsyncNotifierProvider                | Create a AsyncNotifierProvider using generator                                                 |
| riverpodGeneratorVariable                             | Create a variable using generator                                                              |
| riverpodGeneratorNotiferProvider                      | Create a NotifierProvider using generator                                                      |


### Normal syntax
| Shortcut   |      Description      |
|----------|:-------------|
| consumer | New Consumer |
| consumerWidget | New ConsumerWidget |
| consumerStatefulWidget | New ConsumerStatefulWidget |
| hookConsumer | New HookConsumer (must import [hooks_riverpod](https://pub.dev/packages/hooks_riverpod)) |
| hookConsumerWidget | New HookConsumerWidget (must import [hooks_riverpod](https://pub.dev/packages/hooks_riverpod)) |
| changeNotifierProvider* | New ChangeNotifierProvider |
| provider* | New Provider |
| futureProvider* | New FutureProvider |
| streamProvider* | New StreamProvider |
| stateNotifier | New StateNotifier in [state_provider](https://pub.dev/packages/state_notifier) |
| stateNotifierProvider* | New StateNotifierProvider |
| stateProvider* | New StateProvider |

( * ) is suffix modifier, ex: autoDispose, family
