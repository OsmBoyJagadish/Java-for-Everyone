package filterExample;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Creating_Filter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain arg2)
			throws IOException, ServletException {
		
		System.out.println("Hello Filter");
		
		arg2.doFilter(req, res);
		System.out.println("After Filter");
		
	}
}
