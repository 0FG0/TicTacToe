import java.util.Scanner;
import java.util.Random;

public class TicTacToe{
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);

        System.out.println("WELCOME, LET'S PLAY");
        System.out.println("Digit \"1\" to play or \"0\" to exit");
        String response = t.next();

        while(!(response.equals("1")) && !(response.equals("0"))){
            System.out.println("Please digit \"1\" to play or \"0\" to exit");
            response = t.next();
        }

        if(response.equals("0")){
            System.exit(0);
        }

        System.out.println();

        if((response.equals("1"))){

            char [][] matrix = new char[6][11];
        
            matrix[0][0] = ' ';
            matrix[0][1] = ' ';
            matrix[0][2] = ' ';
            matrix[0][3] = '|';
            matrix[0][4] = ' ';
            matrix[0][5] = ' ';
            matrix[0][6] = ' ';
            matrix[0][7] = '|';
            matrix[0][8] = ' ';
            matrix[0][9] = ' ';
            matrix[0][10] = ' ';

            matrix[1][0] = '_';
            matrix[1][1] = '_';
            matrix[1][2] = '_';
            matrix[1][3] = '|';
            matrix[1][4] = '_';
            matrix[1][5] = '_';
            matrix[1][6] = '_';
            matrix[1][7] = '|';
            matrix[1][8] = '_';
            matrix[1][9] = '_';
            matrix[1][10] = '_';

            matrix[2][0] = ' ';
            matrix[2][1] = ' ';
            matrix[2][2] = ' ';
            matrix[2][3] = '|';
            matrix[2][4] = ' ';
            matrix[2][5] = ' ';
            matrix[2][6] = ' ';
            matrix[2][7] = '|';
            matrix[2][8] = ' ';
            matrix[2][9] = ' ';
            matrix[2][10] = ' ';

            matrix[3][0] = '_';
            matrix[3][1] = '_';
            matrix[3][2] = '_';
            matrix[3][3] = '|';
            matrix[3][4] = '_';
            matrix[3][5] = '_';
            matrix[3][6] = '_';
            matrix[3][7] = '|';
            matrix[3][8] = '_';
            matrix[3][9] = '_';
            matrix[3][10] = '_';

            matrix[4][0] = ' ';
            matrix[4][1] = ' ';
            matrix[4][2] = ' ';
            matrix[4][3] = '|';
            matrix[4][4] = ' ';
            matrix[4][5] = ' ';
            matrix[4][6] = ' ';
            matrix[4][7] = '|';
            matrix[4][8] = ' ';
            matrix[4][9] = ' ';
            matrix[4][10] = ' ';

            matrix[5][0] = ' ';
            matrix[5][1] = ' ';
            matrix[5][2] = ' ';
            matrix[5][3] = '|';
            matrix[5][4] = ' ';
            matrix[5][5] = ' ';
            matrix[5][6] = ' ';
            matrix[5][7] = '|';
            matrix[5][8] = ' ';
            matrix[5][9] = ' ';
            matrix[5][10] = ' ';

            printMatrix(matrix);
            
            System.out.println();

            Boolean b = true;
            boolean c = true;
            while(b){
                while(c){
                    System.out.println("Digit the number of the row then the number of the column where you want to play:");
                    String input = t.next();

                    if (!input.equals("11") & !input.equals("12") & !input.equals("13") &
                        !input.equals("21") & !input.equals("22") & !input.equals("23") &
                        !input.equals("31") & !input.equals("32") & !input.equals("33")) {

                        System.out.println("Error: Invalid input. Please try again.");
                    }

                    System.out.println();

                    switch(input){
                        case "11":
                            if(matrix[0][1] == ' '){
                                matrix[0][1] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }   
                        break;
                        case "12":
                            if(matrix[0][5] == ' '){
                                matrix[0][5] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }
                        break;
                        case "13":
                            if(matrix[0][9] == ' '){
                                matrix[0][9] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }
                        break;
                        case "21":
                            if(matrix[2][1] == ' '){
                                matrix[2][1] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }
                        break;
                        case "22":
                            if(matrix[2][5] == ' '){
                                matrix[2][5] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }
                        break;
                        case "23":
                            if(matrix[2][9] == ' '){
                                matrix[2][9] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }
                        break;
                        case "31":
                            if(matrix[4][1] == ' '){
                                matrix[4][1] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }
                        break;
                        case "32":
                            if(matrix[4][5] == ' '){
                                matrix[4][5] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }
                        break;
                        case "33":
                            if(matrix[4][9] == ' '){
                                matrix[4][9] = 'X';
                                c = false;
                            }else{
                                System.out.println("The box you selected is already taken, please try again.");
                            }
                        break;
                    }
                }
                c = true;


                printMatrix(matrix);

                System.out.println();

                //prima orizzontale
                if(matrix[0][1] == 'X' && matrix[0][5] == 'X' && matrix[0][9] == 'X'){
                    System.out.println("YOU WON!");
                    System.exit(0);
                //seconda orizzontale
                }else if(matrix[2][1] == 'X' && matrix[2][5] == 'X' && matrix[2][9] == 'X'){
                    System.out.println("YOU WON!");
                    System.exit(0);
                //terza orrizzontale
                }else if(matrix[4][1] == 'X' && matrix[4][5] == 'X' && matrix[4][9] == 'X'){
                    System.out.println("YOU WON!");
                    System.exit(0);
                //prima vert
                }else if(matrix[0][1] == 'X' && matrix[2][1] == 'X' && matrix[4][1] == 'X'){
                    System.out.println("YOU WON!");
                    System.exit(0);
                //sec vert
                }else if(matrix[0][5] == 'X' && matrix[2][5] == 'X' && matrix[4][5] == 'X'){
                    System.out.println("YOU WON!");
                    System.exit(0);
                //terz vert
                }else if(matrix[0][9] == 'X' && matrix[2][9] == 'X' && matrix[4][9] == 'X'){
                    System.out.println("YOU WON!");
                    System.exit(0);
                }else if(matrix[0][1] == 'X' && matrix[2][5] == 'X' && matrix[4][9] == 'X'){
                    System.out.println("YOU WON!");
                    System.exit(0);
                }else if(matrix[0][9] == 'X' && matrix[2][5] == 'X' && matrix[4][1] == 'X'){
                    System.out.println("YOU WON!");
                    System.exit(0);
                //draw
                }else if(matrix[0][1] != ' ' && matrix[0][5] != ' ' && matrix[0][9] != ' ' &&
                    matrix[0][5] != ' ' && matrix[2][5] != ' ' && matrix[4][5] != ' ' &&
                    matrix[0][9] != ' ' && matrix[2][9] != ' ' && matrix[4][9] != ' '){
                    
                    System.out.println("DRAW!");
                    System.exit(0);
                } 
                    
                System.out.println("The Computer played: ");
                random(matrix);
                System.out.println();
                printMatrix(matrix);
                System.out.println();

                //prima orizzontale
                if(matrix[0][1] == 'O' && matrix[0][5] == 'O' && matrix[0][9] == 'O'){
                    System.out.println("YOU LOST!");
                    System.exit(0);
                //seconda orizzontale
                }else if(matrix[2][1] == 'O' && matrix[2][5] == 'O' && matrix[2][9] == 'O'){
                    System.out.println("YOU LOST!");
                    System.exit(0);
                //terza orrizzontale
                }else if(matrix[4][1] == 'O' && matrix[4][5] == 'O' && matrix[4][9] == 'O'){
                    System.out.println("YOU LOST!");
                    System.exit(0);
                //prima vert
                }else if(matrix[0][1] == 'O' && matrix[2][1] == 'O' && matrix[4][1] == 'O'){
                    System.out.println("YOU LOST!");
                    System.exit(0);
                //sec vert
                }else if(matrix[0][5] == 'O' && matrix[2][5] == 'O' && matrix[4][5] == 'O'){
                    System.out.println("YOU LOST!");
                    System.exit(0);
                //terz vert
                }else if(matrix[0][9] == 'O' && matrix[2][9] == 'O' && matrix[4][9] == 'O'){
                    System.out.println("YOU LOST!");
                    System.exit(0);
                }else if(matrix[0][1] == 'O' && matrix[2][5] == 'O' && matrix[4][9] == 'O'){
                    System.out.println("YOU LOST!");
                    System.exit(0);
                }else if(matrix[0][9] == 'O' && matrix[2][5] == 'O' && matrix[4][1] == 'O'){
                    System.out.println("YOU LOST!");
                    System.exit(0);
                }
            }
        }
        
        t.close();
    }

    public static void printMatrix(char [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void random(char [][] matrix){
        Random random = new Random();

        int randomNumber1 = random.nextInt(3) * 2;
        int randomNumber2 = random.nextInt(3) * 4 + 1;

        if(matrix[randomNumber1][randomNumber2] == ' '){
            matrix[randomNumber1][randomNumber2] = 'O';
        }else{
            random(matrix);
        }
    }
}