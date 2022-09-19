public class Movie {
    private String name;
    private String studio;
    private String rating;
    public Movie(String name, String studio, String rating) {
        this.name = name;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String name, String studio) {
        this.name = name;
        this.studio=studio;
        this.rating="PG";
    }
    public String getName(){
        return name;
    }
//    public String getRating(){
//        return rating;
//    }
    public Movie[] getPG(Movie[] mov){
        Movie[] PGMov=new Movie[mov.length];
        int index=0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                PGMov[index]=mov[i];
                index++;
            }
        }
        return PGMov;
    }
}

class MovieClass {
    public static void main(String[] args) {
        Movie movie1=new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2=new Movie("Jungle Cruise", "Walt Disney Pictures");
        Movie movie3=new Movie("The Intern", "Warner Bros Pictures", "PG");
        Movie[] movieList=new Movie[3];
        movieList[0]=movie1; movieList[1]=movie2; movieList[2]=movie3;
        for (Movie m: (movieList[0].getPG(movieList))){
            if (m!=null)
                System.out.print(m.getName()+"\n");
        }
    }
}
