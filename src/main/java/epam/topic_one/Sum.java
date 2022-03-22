package epam.topic_one;

class Sum {

    static int[] getIndex(int[] array, int sum) {
        int[] arrayIndexes = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    arrayIndexes[0] = j;
                    arrayIndexes[1] = i;
                    break;
                }
            }
        }
        return arrayIndexes;
    }
}
