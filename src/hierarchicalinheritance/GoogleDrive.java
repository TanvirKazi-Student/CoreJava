package hierarchicalinheritance;

public class GoogleDrive extends Google {

	private int photos;
	private int videos;
	private int docs;
	private int audio;
	private int bin;

	public GoogleDrive() {

	}

	public GoogleDrive(String ceo, String add, double turnover, String email, String pass, int photos, int videos,
			int docs, int audio, int bin) {
		super(ceo, add, turnover, email, pass);

		this.photos = photos;
		this.videos = videos;
		this.docs = docs;
		this.audio = audio;
		this.bin = bin;
	}

	public void add(String fileType) {

		switch (fileType) {

		case "photo": {
			System.out.println("Photo added");
			photos++;
		}
			break;
		case "video": {
			System.out.println("video added");
			videos++;
		}
			break;
		case "audio": {
			System.out.println("audio added");
			audio++;
		}
			break;
		case "docs": {
			System.out.println("Document added");
			docs++;
		}
			break;
		default: {
			System.out.println("Invalid fileType");
		}

		}

	}

	public void delet(String fileType) {

		switch (fileType) {
		case "photo": {
			System.out.println("Photo deleted");
			photos--;
			bin++;
		}
			break;
		case "video": {
			System.out.println("video deleted");
			videos--;
			bin++;
		}
			break;
		case "audio": {
			System.out.println("audio deleted");
			audio--;
			bin++;
		}
			break;
		case "docs": {
			System.out.println("docs deleted");
			docs--;
			bin++;
		}
			break;
		default: {
			System.out.println("Invalid FileType");
		}
		}
	}

	public void displayGoogleDriverDetails() {
		displayGoogle();
		System.out.println("GoogleDriver Photos :" + photos);
		System.out.println("GoogleDriver videos :" + videos);
		System.out.println("GoogleDriver docs :" + docs);
		System.out.println("GoogleDriver audio :" + audio);
		System.out.println("GoogleDriver bin :" + bin);
	}

}
