# 정수 리스트 arr 가 주어 집니다.
# 이 리스트 에서 음수를 모두 제거한 뒤,
# 남은 숫자의 제곱을 구한 리스트 를 반환 하는 함수를 만들어 보세요.


def solution(arr):
    result = []
    for num in arr:
        if num >= 0:
            result.append(num ** 2)
    return result

# 입력:  arr = [3, -1, 4, -2, 0]
# 출력: [9, 16, 0]
