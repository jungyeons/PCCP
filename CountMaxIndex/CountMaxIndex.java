package CountMaxIndex;

class CountMaxIndex {
    public int[] getMaxIndexes(int [] arr) {
        // 시나리오 1
        // array에서 인덱스를 증가시키면서 가장 큰 값을 가진 arr의 인덱스를 저장
        // 저장한 인덱스 배열을 출력
        int maxValueIndex = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[maxValueIndex]){
                maxValueIndex = i;
            }else if(arr[i] == arr[maxValueIndex]){
                //최댓값 저장하려는 배열 만들기 위해 count측정
                count++;
            }
        }

        int [] answer = new int[count];
        for(int i = 0; i < count; i++){
            if(arr[i] == arr[maxValueIndex]){
                answer[i] = maxValueIndex;
            }

        }
        return answer;

    }
}