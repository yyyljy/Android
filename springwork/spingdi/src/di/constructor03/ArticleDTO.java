package di.constructor03;

public class ArticleDTO {
	private String name;
	private String title;
	private String content;
	private String date;
	public ArticleDTO(String name, String title, String content, String date) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	public ArticleDTO() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ArticleDTO [name=" + name + ", title=" + title + ", content=" + content + ", date=" + date + "]";
	}
	
}
