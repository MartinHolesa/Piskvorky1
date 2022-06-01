
package com.mycompany.piskvorky1;


public class GameManager{

        private static GameManager gameManager;

        public String idHry;
        public int hrac1_score;
        public int hrac2_score;
        public String hrac1_name;
        public String hrac2_name;



        public void setNames(String hrac1_name, String hrac2_name){
            this.hrac1_name = hrac1_name;
            this.hrac2_name = hrac2_name;
        }
        public void setScore(int score1, int score2){
            this.hrac1_score = score1;
            this.hrac2_score = score2;
        }

        public void setGameId(String idHry){
            this.idHry = idHry;
        }
        private GameManager(){

        }

        public static GameManager instance(){
            if(gameManager == null){
                gameManager = new GameManager();
            }
            return gameManager;
        }

}
