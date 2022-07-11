package java_dom_parser;

public class Entry {
	private String title;
	private String link;
	private String id;
	private String published;
	private String updated;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "Entry [title=" + title + ", link=" + link + ", id=" + id + ", published=" + published + ", updated="
				+ updated + "]";
	}
	

}
