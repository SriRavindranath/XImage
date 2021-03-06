package org.ximage.filter;

import org.ximage.common.XimageException;
import org.ximage.parser.HtmlDoc;

/**
 * Base inteface for applying filtering
 * @author Siddheshwar rai.skumar@gmail.com
 *
 */
public interface Filter {
	public HtmlDoc execute(HtmlDoc doc) throws XimageException;
}
