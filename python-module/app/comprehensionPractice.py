# 입력: "apple123banana456cherry"
# 출력: 숫자만 추출해서 리스트로

text = "apple123banana456cherry"
numbers = [int(char) for char in text if char.isdigit()]
print(numbers)
