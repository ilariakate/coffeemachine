class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] cube = new int[3][3][3];
        for (int i = 0; i < cube[0].length; i++) {
            int count = 0;
            for (int j = 0; j < cube[0].length; j++) {
                for (int k = 0; k < cube[0].length; k++) {
                    cube[i][j][k] = count;
                    count++;
                }
            }
        }
        return cube;
    }
}