package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Welcome extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		
		try {
			JspWriter out = pageContext.getOut();
			out.print("<h1>good morning</h1>");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
	
	

}
