for(i in 0..3) {             // 0から３まで
  print(i)
}
print(" ")

for(i in 0 until 3) {        // 3未満
  print(i)
}
print(" ")

for(i in 2..8 step 2) {      // 2から8まで２飛ばし
  print(i)
}
print(" ")

for (i in 3 downTo 0) {      // 3から０まで
  print(i)
}
print(" ")

// 連続するアルファベットでも可能
for (c in 'a'..'d') {        // abcd
  print(c)
}
print(" ")

for (c in 'z' downTo 's' step 2) { // zxvt zから２飛ばしで戻す
  print(c)
}
print(" ")

// in で、範囲内かの判定ができる。
val x = 2
if (x in 1..5) {            // 1から５の範囲内か
    print("x is in range from 1 to 5")
}
println()

if (x !in 6..10) {          // 6から１０の範囲外か
    print("x is not in range from 6 to 10")
}