package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css\"\n");
      out.write("              integrity=\"sha512-NhSC1YmyruXifcj/KFRWoC561YpHpc5Jtzgvbuzx5VozKpWvQ+4nXhPdFgmx8xqexRcpAglTj9sIBWINXa8x5w==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/base.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\"\n");
      out.write("              integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <title>Document</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <!-- Navbar -->\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <ul class=\"nav-list\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"home\" class=\"nav-item-link\">Trang ch???</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"\" class=\"nav-item-link\">Gi???i thi???u</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"\" class=\"nav-item-link\">Khuy???n m??i</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"\" class=\"nav-item-link\">Li??n h???</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav-list\">\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- Search -->\n");
      out.write("                <div class=\"search\">\n");
      out.write("                    <div class=\"search-shopname\">Phake Shoes</div>\n");
      out.write("                    <div class=\"search-titlecart search-titlecart--separate\">Gi??? h??ng</div>\n");
      out.write("                    <div class=\"search-searchbar\" style=\"margin-left: 184px;\">\n");
      out.write("                        <input class=\"search-searchbar-input\" type=\"text\" placeholder=\"Nh???p t??n s???n ph???m c???n t??m ki???m...\" />\n");
      out.write("                        <button class=\"search-searchbar-btn\"><i\n");
      out.write("                                class=\"search-searchbar-btn-icon fa-solid fa-magnifying-glass\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"cart-container\">\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <img src=\"https://as2.ftcdn.net/v2/jpg/03/83/82/35/1000_F_383823517_aqubmITTeyazMtApMLV7grhTObkzKphk.jpg\" style=\"width: inherit; height: 250px;\"/>\n");
      out.write("                <div class=\"cart-nav\">\n");
      out.write("                    <a class=\"cart-nav-link\" href=\"home\">Trang ch???</a>\n");
      out.write("                    <i class=\"cart-nav-icon fa-solid fa-angles-right\"></i>\n");
      out.write("                    <div class=\"cart-name\"> Gi??? h??ng</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cart-heading\">\n");
      out.write("                    <div class=\"cart-heading-item-sp\">S???n ph???m</div>\n");
      out.write("                    <div class=\"cart-heading-item-dg\">????n gi??</div>\n");
      out.write("                    <div class=\"cart-heading-item-sl\">S??? l?????ng</div>\n");
      out.write("                    <div class=\"cart-heading-item-st\">S??? ti???n</div>\n");
      out.write("                    <div class=\"cart-heading-item-tt\">Thao t??c</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cart-content\">\n");
      out.write("                    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <div class=\"cart-payment\">\n");
      out.write("                        <div class=\"cart-money\">\n");
      out.write("                            <span>T???ng ti???n:</span>\n");
      out.write("                            <div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.getTotalMoney()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cart-btn\">\n");
      out.write("                    <a href=\"home\" class=\"cart-payment-btn cart-payment-btn--con\">TI???P T???C MUA H??NG</a>\n");
      out.write("                    <form action=\"checkout\" method=\"post\">\n");
      out.write("                        <input class=\"cart-payment-btn cart-payment-btn--buy\" type=\"submit\" value=\"TI???N H??NH ?????T H??NG\"/>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cart-ending\">\n");
      out.write("                    <i class=\"cart-ending-icon fa-sharp fa-solid fa-truck\"></i>\n");
      out.write("                    <label>V???N CHUY???N: </label>\n");
      out.write("                    <div> H??? tr??? ship COD to??n qu???c</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--     Footer-->\n");
      out.write("        ");
      out.write("\n");
      out.write("<footer class=\"footer\">\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <div class=\"grid__row\">\n");
      out.write("        \n");
      out.write("                    <div class=\"grid__column-2-4\">\n");
      out.write("                        <h3 class=\"footer-heading\">\n");
      out.write("                            GI???I THI???U\n");
      out.write("                        </h3>\n");
      out.write("                        <ul class=\"footer-list\">\n");
      out.write("                        <li class=\"footer-list-item\">\n");
      out.write("                            <a href=\"\" class=\"footer-list-item-link\">Sneaker</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-list-item\">\n");
      out.write("                            <a href=\"\" class=\"footer-list-item-link\">Gi???m gi??</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-list-item\">\n");
      out.write("                            <a href=\"\" class=\"footer-list-item-link\">T???t c??? s???n ph???m</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-list-item\">\n");
      out.write("                            <a href=\"\" class=\"footer-list-item-link\">??i???u kho???n</a>\n");
      out.write("                        </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid__column-2-4\">\n");
      out.write("                        <h3 class=\"footer-heading\">\n");
      out.write("                            CH??M S??C KH??CH H??NG\n");
      out.write("                        </h3>\n");
      out.write("                        <ul class=\"footer-list\">\n");
      out.write("                            <li class=\"footer-list-item\">\n");
      out.write("                                <a href=\"\" class=\"footer-list-item-link\">Trung t??m tr??? gi??p</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"footer-list-item\">\n");
      out.write("                                <a href=\"\" class=\"footer-list-item-link\">H?????ng d???n mua h??ng</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"grid__column-2-4\">\n");
      out.write("                        <h3 class=\"footer-heading\">\n");
      out.write("                            H??? TR???\n");
      out.write("                        </h3>\n");
      out.write("                        <ul class=\"footer-list\">\n");
      out.write("                        <li class=\"footer-list-item\">\n");
      out.write("                            <a href=\"\" class=\"footer-list-item-link\">\n");
      out.write("                                T?? v???n 24/7, hi???n t???i c???a h??ng ??ang s???a ch???a m???t b???ng n??n ch??? b??n online\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"grid__column-2-4\">\n");
      out.write("                        <h3 class=\"footer-heading\">\n");
      out.write("                            CH??NH S??CH\n");
      out.write("                        </h3>\n");
      out.write("                        <ul class=\"footer-list\">\n");
      out.write("                        <li class=\"footer-list-item\">\n");
      out.write("                            <a href=\"\" class=\"footer-list-item-link\">\n");
      out.write("                                Ch??nh s??ch ?????i tr???\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"grid__column-2-4\">\n");
      out.write("                        <h3 class=\"footer-heading\">\n");
      out.write("                            LI??N H???\n");
      out.write("                        </h3>\n");
      out.write("                        <ul class=\"footer-list\">\n");
      out.write("                        <li class=\"footer-list-item\">\n");
      out.write("                            <a href=\"\" class=\"footer-list-item-link\">\n");
      out.write("                                <i class=\"fa-brands fa-facebook\"></i>\n");
      out.write("                                Facebook\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-list-item\"></li>\n");
      out.write("                        <a href=\"\" class=\"footer-list-item-link\">\n");
      out.write("                            <i class=\"fa-brands fa-instagram\"></i>\n");
      out.write("                            Instagram\n");
      out.write("                        </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-list-item\"></li>\n");
      out.write("                        <a href=\"\" class=\"footer-list-item-link\">\n");
      out.write("                            <i class=\"fa-sharp fa-solid fa-g\"></i>\n");
      out.write("                            Gmail\n");
      out.write("                        </a>\n");
      out.write("                        </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("size");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item nav-item--separate\">\n");
        out.write("                                <a href=\"signup.jsp\" class=\"nav-item-link\">????ng k??</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a href=\"login.jsp\" class=\"nav-item-link\">????ng nh???p</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null && sessionScope.acc.isAdmin != 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item nav-user\">\n");
        out.write("                                <span class=\"nav-user-name\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                <img src=\"https://sme.hust.edu.vn/wp-content/uploads/2022/02/Avatar-Facebook-trang.jpg\"\n");
        out.write("                                     alt=\"\" class=\"nav-user-img\">\n");
        out.write("\n");
        out.write("                                <ul class=\"nav-user-menu\">\n");
        out.write("                                    <li class=\"nav-user-item\">\n");
        out.write("                                        <a href=\"\">Th??ng tin c?? nh??n</a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-user-item\">\n");
        out.write("                                        <a href=\"\">????n mua</a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-user-item nav-user-item--separate\">\n");
        out.write("                                        <a href=\"logout\">????ng xu???t</a>\n");
        out.write("                                    </li>\n");
        out.write("                                </ul>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item nav-user\">\n");
        out.write("                                <span class=\"nav-user-name\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                <img src=\"https://sme.hust.edu.vn/wp-content/uploads/2022/02/Avatar-Facebook-trang.jpg\"\n");
        out.write("                                     alt=\"\" class=\"nav-user-img\">\n");
        out.write("\n");
        out.write("                                <ul class=\"nav-user-menu\">\n");
        out.write("                                    <li class=\"nav-user-item\">\n");
        out.write("                                        <a href=\"\">Qu???n l?? t??i kho???n</a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-user-item\">\n");
        out.write("                                        <a href=\"manager\">Qu???n l?? s???n ph???m</a>\n");
        out.write("                                    </li>                                    \n");
        out.write("                                    <li class=\"nav-user-item nav-user-item--separate\">\n");
        out.write("                                        <a href=\"logout\">????ng xu???t</a>\n");
        out.write("                                    </li>\n");
        out.write("                                </ul>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("o");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("t");
    _jspx_th_c_set_2.setValue(new String("0"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                        <div class=\"cart-item\">\n");
          out.write("                            <div class=\"cart-item-inf\">\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"cart-item-img\"/>\n");
          out.write("                                <div class=\"cart-item-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                                <div class=\"cart-item-size\">K??ch c???: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                            <div class=\"cart-item-priceonly\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("??</div>\n");
          out.write("                            <div class=\"cart-item-quantity\">\n");
          out.write("                                <a href=\"process?num=-1&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&size=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">-</a>\n");
          out.write("                                <input type=\"text\" readonly value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                <a href=\"process?num=1&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&size=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">+</a>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"cart-item-money\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity*i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("??</div>\n");
          out.write("                            <div class=\"cart-item-remove\">\n");
          out.write("                                <form action=\"process\" method=\"post\">\n");
          out.write("                                    <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                    <input type=\"hidden\" name=\"size\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                    <input class=\"cart-item-remove-btn\" type=\"submit\" value=\"X??a\"/>\n");
          out.write("                                </form>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_3.setVar("t");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t + 1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }
}
