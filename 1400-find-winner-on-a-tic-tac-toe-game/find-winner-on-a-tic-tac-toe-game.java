class Solution {
    public String tictactoe(int[][] moves) {
        char[][] arr = new char[3][3];
        for(int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];
            if(i % 2 == 0) 
                arr[r][c] = 'X';
            else 
                arr[r][c] = 'O';
        }
        for(int i = 0; i < 3; i++) {
            if(arr[i][0] != 0 && arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2])
            return (arr[i][0] == 'X') ? "A" : "B";
            
            if(arr[0][i] != 0 && arr[0][i] == arr[1][i] && arr[0][i] == arr[2][i])
            return (arr[0][i] == 'X') ? "A" : "B";
        }

        if(arr[0][0] != 0 && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2])
        return (arr[0][0] == 'X') ? "A" : "B";
        if(arr[0][2] != 0 && arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0])
        return (arr[2][0] == 'X') ? "A" : "B";


        if(moves.length == 9) return "Draw";
        else return "Pending";
    }
}