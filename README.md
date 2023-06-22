# 具体例
## case1
- 入力「あ」→　出力「数字ではありません。」
## case2
- 入力「a」→　出力「数字ではありません。」
## case3
- 入力「1」→　出力「1」
## case4
- 入力「1000」→　出力「1000」
## case5
- 入力「**」→　出力「数字ではありません。」
## case6
- 入力「0.1」→　出力「数字ではありません。」

# TODOリスト
## 準備作業
- ファイルを作る
  - Eclipseを起動する
  - Javaプロジェクトを作る
  - パッケージを選択する
  - Lesson1.javaを作る
- クラスを作る 
  - Lesson1クラスを書く
  - 空のmain()メソッドを作る

## 入力
- 文字列を入力する
  - Scannerを作る
  - Scanner.nextLine()メソッドで文字列を入力する
  - 変数wordに格納する
  - println()でwordを表示して動作確認する

## 処理
- 数字を作る
  - try{}を作る
  - Integer.parseIntでwordを数字に変換する
  - 変数numに格納する
  - catch{}を作る
  - 変数にNumberFormatExceptionを入れる
  - println()でnumを表示して動作確認する(try内)
  - println()でfalseを表示して動作確認する(catch内)

## 出力
- 数字を出力
  - println()でnumを出力する(try内)
- 「数字ではありません。」を出力する
  - println()で「数字ではありません。」を出力する(catch内)

## 動作確認
- 全体を動かして確認する
  - 「1」を入力して確認する
  - 「あ」を入力して確認する

# 具体例
