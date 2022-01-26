package leetcode;
/*leetcode_74搜索二维矩阵*/
//双重二分法，先对行进行二分，确定矩阵的某一行，在对该行的元素进行二分查找，可解
public class question_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int left1 = 0;
        int right1 = row-1;
        int left2 = 0;
        int right2 = column-1;
        while(left1!=right1){
            int mid_row = left1+(right1-left1)/2;
            if(matrix[mid_row][right2] == target){
                return true;
            }else if(matrix[mid_row][right2] > target){
                right1 = mid_row;
            }else if(matrix[mid_row][right2] < target){
                left1 = mid_row + 1;
            }
        }
        while(left2<=right2){
            int mid_column = left2+(right2-left2)/2;
            if(matrix[left1][mid_column] == target){
                return true;
            }else if(matrix[left1][mid_column] > target){
                right2 = mid_column-1;
            }else if(matrix[left1][mid_column] < target){
                left2 =mid_column+1;
            }
        }
        return false;
    }
}

