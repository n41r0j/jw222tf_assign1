package jw222tf_assign4.newsagency;

/**
 * Created by Jorian on 6-1-2017 at 15:12.
 */
public class NewsArticle {
    private String owner;
    private String headline;
    private Newspaper newspaper;

    NewsArticle(Newspaper owner, String headline) {
        newspaper = owner;
        this.owner = owner.getName();
        this.headline = headline;
        //When a newspaper creates a news article, it automatically gets added to the ArrayList in the Newspaper instance:
        owner.addToArticlesUponCreation(this);
    }

    Newspaper getOwner() {
        return newspaper;
    }

    String getHeadline() {
        return headline;
    }
}
