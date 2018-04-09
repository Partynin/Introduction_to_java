package Chapter_8;

public class SortStudentsOnGrades {
    /** Main method */
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        // Key the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] sort = new int[8][2];

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            sort[i][0] = i;
            sort[i][1] = correctCount;
            System.out.println("Student " + i + "'s correct countPosition is " +
                    correctCount);
        }

        for (int i = 0; i < sort.length - 1; i++) {
             // Find the minimum in the list[i..list.length-1]
             int currentMinGrad = sort[i][1];
             int currentMinStudent = sort[i][0];
            int currentMinIndex = i;
             for (int j = i + 1; j < sort.length; j++) {
                 if (currentMinGrad > sort[j][1]) {
                    currentMinGrad = sort[j][1];
                    currentMinStudent = sort[j][0];
                    currentMinIndex = j;
                     }
                 }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                sort[currentMinIndex][1] = sort[i][1];
                sort[currentMinIndex][0] = sort[i][0];
                sort[i][1] = currentMinGrad;
                sort[i][0] = currentMinStudent;
                }
            }

        System.out.println();

        for (int i = 0; i < sort.length; i++) {
            System.out.println("Student " + sort[i][0] + "'s correct countPosition is " +
                    sort[i][1]);
        }
        }
    }

