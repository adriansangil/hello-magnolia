package demo.adrian.pojo;

import java.util.List;

public class Contents {
	private List<Quote> quotes;

	private String copyright;

	
	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@Override
	public String toString() {
		return "ClassPojo [quotes = " + quotes + ", copyright = " + copyright + "]";
	}

	public List<Quote> getQuotes() {
		return quotes;
	}

	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}
}