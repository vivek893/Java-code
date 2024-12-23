import java.util.Scanner;
class Spotify{
    private int spotifyid;
    private String profileName;
    private String subscriptionType;
    private double subscriptionPrice;
    private String groupSessionAvailable;
    public Spotify(int spotifyid,String profileName,String subscriptionType, double subscriptionPrice,String groupSessionAvailable){
        this.spotifyid=spotifyid;
        this.profileName=profileName;
        this.subscriptionType=subscriptionType;
        this.subscriptionPrice=subscriptionPrice;
        this.groupSessionAvailable=groupSessionAvailable;
    }
    public int getspotifyid(){
        return spotifyid;
    }
    public String getprofileName(){
        return profileName;
    }
    public String getsubscriptionType(){
        return subscriptionType;
    }
    public double getsubscriptionPrice(){
        return subscriptionPrice;
    }
    public String getgroupSessionAvailable(){
        return groupSessionAvailable;
    }
    /*   @Override
    public String toString() {
        return "Spotify ID: " + spotifyid + ", Profile Name: " + profileName + ", Subscription Type: " + subscriptionType +
                ", Subscription Price: " + subscriptionPrice + ", Group Session Available: " + groupSessionAvailable;
    } */
   public void setspotifyid(int spotifyId){
    this.spotifyid=spotifyId;
   }
   public void setprofileName(String profileName){
    this.profileName=profileName;
   }
   public void setsubscriptiontype(String subscriptionType){
    this.subscriptionType=subscriptionType;
   }
   public void setsubscriptionPrice(String subscriptionPrice){
    this.subscriptionPrice=subscriptionPrice;
   }
   public void setgroupSessionAvailable(String groupSessionAvailable){
    this.groupSessionAvailable=groupSessionAvailable;
   }
}
public class subscription {
    public static void main(String[] args){
        Scanner Scanner =new Scanner(System.in);
        Spotify spotify[]=new Spotify[5];  // 5 is size of array. it doesn't depend on how many variable present in spotify class.simply it just size of array. you can change like 6,7,3,8. what you want.
        for(int i=0;i<4;i++){  // 4 is total 4 times loop will excute.
            int spotifyId=Scanner.nextInt();
            Scanner.nextLine();
            String profileName=Scanner.nextLine();
            String subscriptionType=Scanner.nextLine();
            double subscriptionPrice=Scanner.nextDouble();
            Scanner.nextLine();
            String groupSessionAvailable=Scanner.nextLine();
            spotify[i]=new Spotify(spotifyId,profileName,subscriptionType,subscriptionPrice,groupSessionAvailable);
        }
        String subscriptionType=Scanner.nextLine();
        String groupSessionAvailable=Scanner.nextLine();
        double Avg=findaveragesubscription(spotify,subscriptionType,groupSessionAvailable);
        System.out.println(Avg);
        Scanner.close();

    }
    public static double findaveragesubscription(Spotify spotify[],String subscriptionType,String groupSessionAvailable){
        double sum=0;// double because supscription price is double.
        int count=0;
        for(int i=0;i<spotify.length;i++){
       
            if(spotify[i]!=null && subscriptionType.equals(spotify[i].getsubscriptionType()) && groupSessionAvailable.equals(spotify[i].getgroupSessionAvailable())){
                sum+=spotify[i].getsubscriptionPrice();
                count+=1;

            }
        }
        if(sum>0){
            return sum/count;
        }
        return 0.0;

    }
    
}
