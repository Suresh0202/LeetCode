class Spreadsheet {
    int arr[][];
    public Spreadsheet(int rows) {
        arr=new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        int ch=cell.charAt(0)-'A';
       int num= Integer.parseInt(cell.substring(1)) - 1;
        arr[num][ch]=value;
    }
    
    public void resetCell(String cell) {
        int ch=cell.charAt(0)-'A';
        int num = Integer.parseInt(cell.substring(1)) - 1;
        arr[num][ch]=0;
    }
    
    public int getValue(String formula) {
         String[] parts = formula.substring(1).split("\\+");
         int sum = 0;
         for (String part : parts) {
            part = part.trim();
            if (Character.isLetter(part.charAt(0))) {
               
                int col = part.charAt(0) - 'A';
                int row = Integer.parseInt(part.substring(1)) - 1;
                sum += arr[row][col]; 
            } else {
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */