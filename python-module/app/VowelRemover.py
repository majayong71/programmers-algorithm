"""
영어 에서는 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록
solution 함수를 완성해주세요.

제한사항
my_string은 소문자와 공백으로 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000

"""


def solution(my_string):
    return ''.join([ch for ch in my_string if ch not in 'aeiou'])


print(solution("hello world"))  # Output: "hll wrld"

"""
[ch for ch in my_string if ch not in 'aeiou']
[ 결과 for 변수명 in 반복대상 if 조건 ]

| 파트                  | 설명                                                              
| ------------------- | --------------------------------------------------------------- 
| `ch`                | **결과값 타입: 문자 (str)**<br>→ 리스트에 담길 요소                            
| `for`               | **반복문 키워드**                                                     
| `ch`                | **반복 변수명** (하나씩 꺼낸 값이 담김)<br>→ 타입은 문자열이니까 `str` (자바로 치면 `char`) 
| `in`                | **소속 조건 키워드**<br>→ “\~ 안에 있는”
| `my_string`         | **반복 대상**<br>→ 타입은 `str` (파이썬 문자열 = 문자 리스트처럼 동작)                
| `if`                | **조건문 키워드**                                                     
| `ch not in 'aeiou'` | **조건식**<br>→ `ch`가 `'aeiou'` 안에 없으면 True                        

[ch                      # 리스트에 담을 값 (char)
 for ch                 # 반복 변수 ch (char 타입 느낌)
 in my_string           # 반복 대상 (문자열 = char[] 느낌)
 if ch not in 'aeiou'   # 조건문
]
"""
