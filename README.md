### Hexlet tests and linter status:
[![Actions Status](https://github.com/drresist/java-project-lvl1/workflows/hexlet-check/badge.svg)](https://github.com/drresist/java-project-lvl1/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/ab76eefb329d77421d92/maintainability)](https://codeclimate.com/github/drresist/java-project-lvl1/maintainability)
[![GradleBuild](https://github.com/drresist/java-project-lvl1/actions/workflows/gradleBuild.yml/badge.svg)](https://github.com/drresist/java-project-lvl1/actions/workflows/gradleBuild.yml)

## Install and run
<details open>
<summary>Build & install & run</summary>
<br>

[![asciicast](https://asciinema.org/a/4dh41n8DMbS2ILZ2eyYvr8htl.svg)](https://asciinema.org/a/4dh41n8DMbS2ILZ2eyYvr8htl)
</details>

## Included games

### Even game

<details open>
<summary>Asciinema</summary>
<br>

[![asciicast](https://asciinema.org/a/FvROZmJXjQsFXX8IN56FNuzKb.svg)](https://asciinema.org/a/FvROZmJXjQsFXX8IN56FNuzKb)
</details>
The idea of the game is as follows: the user is shown a random number. And he has to answer _yes_,
if the number is even, or _no_ if it is odd:

```shell
Welcome to the Brain Games!
May I have your name? Bill
Hello, Bill!
Answer 'yes' if number even otherwise answer 'no'.
Question: 15
Your answer: yes
```
* If the user gives the wrong answer, it is necessary to end the game and display a message:

    ```shell
    'yes' is wrong answer ;(. The correct answer was 'no'.
    Let's try again, Bill!
    ```
* If the user gives the correct answer, the message should display:

`Correct!`
and go on to the next number.

The user must give the correct answer to three consecutive questions. After a successful game, it should display:

```
Congratulations, Bill!
```