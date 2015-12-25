package album;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;;

public class Album implements Serializable {
	private int id;
	private int uid;
	private String type;
	private Set<album.Image> images = new HashSet<album.Image>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<album.Image> getImages() {
		return images;
	}

	public void setImages(Set<album.Image> images) {
		this.images = images;
	}
}
