package demo.adrian.pojo;

public class QuoteCategory {

	private Contents contents;

	private Success success;

	public Contents getContents() {
		return contents;
	}

	public void setContents(Contents contents) {
		this.contents = contents;
	}

	public Success getSuccess() {
		return success;
	}

	public void setSuccess(Success success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "ClassPojo [contents = " + contents + ", success = " + success + "]";
	}
}