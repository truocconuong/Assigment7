import java.util.ArrayList;

public class News implements INews {
    public int ID;
    public String title;
    public String PublishDate;
    public String Author;
    public String Content;
    public Float AverageRate;
    int[] RateList ;



    public Float getAverageRate() {
        return AverageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void Display() {
        System.out.println(title + " - "+PublishDate + " - "+Author +" - "+Content+ " - "+AverageRate);
    }
    public void Calculate(){
        int result = 0;
        // trung bình cộng
        for(int value : RateList){
            result +=value;
        }
this.AverageRate = Float.valueOf((result/3));
    }

    public News(int ID, String title, String publishDate, String author, String content,  int[] rateList) {
        this.ID = ID;
        this.title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        RateList = rateList;
    }
}
