package com.scb.util;

public class EmailBodyCreater {
	
	public static String createBody(String token) {
		String link="http://localhost:8080/myaccount/verify/email/"+token;
		
		String emailBody="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><head>\r\n" + 
				"    <!--[if gte mso 9]><xml>\r\n" + 
				"     <o:OfficeDocumentSettings>\r\n" + 
				"      <o:AllowPNG/>\r\n" + 
				"      <o:PixelsPerInch>96</o:PixelsPerInch>\r\n" + 
				"     </o:OfficeDocumentSettings>\r\n" + 
				"    </xml><![endif]-->\r\n" + 
				"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width\">\r\n" + 
				"    <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\r\n" + 
				"    <title></title>\r\n" + 
				"    <!--[if !mso]><!-- -->\r\n" + 
				"	<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"	<!--<![endif]-->\r\n" + 
				"    \r\n" + 
				"    <style type=\"text/css\" id=\"media-query\">\r\n" + 
				"      body {\r\n" + 
				"  margin: 0;\r\n" + 
				"  padding: 0; }\r\n" + 
				"\r\n" + 
				"table, tr, td {\r\n" + 
				"  vertical-align: top;\r\n" + 
				"  border-collapse: collapse; }\r\n" + 
				"\r\n" + 
				".ie-browser table, .mso-container table {\r\n" + 
				"  table-layout: fixed; }\r\n" + 
				"\r\n" + 
				"* {\r\n" + 
				"  line-height: inherit; }\r\n" + 
				"\r\n" + 
				"a[x-apple-data-detectors=true] {\r\n" + 
				"  color: inherit !important;\r\n" + 
				"  text-decoration: none !important; }\r\n" + 
				"\r\n" + 
				"[owa] .img-container div, [owa] .img-container button {\r\n" + 
				"  display: block !important; }\r\n" + 
				"\r\n" + 
				"[owa] .fullwidth button {\r\n" + 
				"  width: 100% !important; }\r\n" + 
				"\r\n" + 
				"[owa] .block-grid .col {\r\n" + 
				"  display: table-cell;\r\n" + 
				"  float: none !important;\r\n" + 
				"  vertical-align: top; }\r\n" + 
				"\r\n" + 
				".ie-browser .num12, .ie-browser .block-grid, [owa] .num12, [owa] .block-grid {\r\n" + 
				"  width: 600px !important; }\r\n" + 
				"\r\n" + 
				".ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {\r\n" + 
				"  line-height: 100%; }\r\n" + 
				"\r\n" + 
				".ie-browser .mixed-two-up .num4, [owa] .mixed-two-up .num4 {\r\n" + 
				"  width: 200px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .mixed-two-up .num8, [owa] .mixed-two-up .num8 {\r\n" + 
				"  width: 400px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.two-up .col, [owa] .block-grid.two-up .col {\r\n" + 
				"  width: 300px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.three-up .col, [owa] .block-grid.three-up .col {\r\n" + 
				"  width: 200px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.four-up .col, [owa] .block-grid.four-up .col {\r\n" + 
				"  width: 150px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.five-up .col, [owa] .block-grid.five-up .col {\r\n" + 
				"  width: 120px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.six-up .col, [owa] .block-grid.six-up .col {\r\n" + 
				"  width: 100px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.seven-up .col, [owa] .block-grid.seven-up .col {\r\n" + 
				"  width: 85px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.eight-up .col, [owa] .block-grid.eight-up .col {\r\n" + 
				"  width: 75px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.nine-up .col, [owa] .block-grid.nine-up .col {\r\n" + 
				"  width: 66px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.ten-up .col, [owa] .block-grid.ten-up .col {\r\n" + 
				"  width: 60px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.eleven-up .col, [owa] .block-grid.eleven-up .col {\r\n" + 
				"  width: 54px !important; }\r\n" + 
				"\r\n" + 
				".ie-browser .block-grid.twelve-up .col, [owa] .block-grid.twelve-up .col {\r\n" + 
				"  width: 50px !important; }\r\n" + 
				"\r\n" + 
				"@media only screen and (min-width: 620px) {\r\n" + 
				"  .block-grid {\r\n" + 
				"    width: 600px !important; }\r\n" + 
				"  .block-grid .col {\r\n" + 
				"    vertical-align: top; }\r\n" + 
				"    .block-grid .col.num12 {\r\n" + 
				"      width: 600px !important; }\r\n" + 
				"  .block-grid.mixed-two-up .col.num4 {\r\n" + 
				"    width: 200px !important; }\r\n" + 
				"  .block-grid.mixed-two-up .col.num8 {\r\n" + 
				"    width: 400px !important; }\r\n" + 
				"  .block-grid.two-up .col {\r\n" + 
				"    width: 300px !important; }\r\n" + 
				"  .block-grid.three-up .col {\r\n" + 
				"    width: 200px !important; }\r\n" + 
				"  .block-grid.four-up .col {\r\n" + 
				"    width: 150px !important; }\r\n" + 
				"  .block-grid.five-up .col {\r\n" + 
				"    width: 120px !important; }\r\n" + 
				"  .block-grid.six-up .col {\r\n" + 
				"    width: 100px !important; }\r\n" + 
				"  .block-grid.seven-up .col {\r\n" + 
				"    width: 85px !important; }\r\n" + 
				"  .block-grid.eight-up .col {\r\n" + 
				"    width: 75px !important; }\r\n" + 
				"  .block-grid.nine-up .col {\r\n" + 
				"    width: 66px !important; }\r\n" + 
				"  .block-grid.ten-up .col {\r\n" + 
				"    width: 60px !important; }\r\n" + 
				"  .block-grid.eleven-up .col {\r\n" + 
				"    width: 54px !important; }\r\n" + 
				"  .block-grid.twelve-up .col {\r\n" + 
				"    width: 50px !important; } }\r\n" + 
				"\r\n" + 
				"@media (max-width: 620px) {\r\n" + 
				"  .block-grid, .col {\r\n" + 
				"    min-width: 320px !important;\r\n" + 
				"    max-width: 100% !important;\r\n" + 
				"    display: block !important; }\r\n" + 
				"  .block-grid {\r\n" + 
				"    width: calc(100% - 40px) !important; }\r\n" + 
				"  .col {\r\n" + 
				"    width: 100% !important; }\r\n" + 
				"    .col > div {\r\n" + 
				"      margin: 0 auto; }\r\n" + 
				"  img.fullwidth, img.fullwidthOnMobile {\r\n" + 
				"    max-width: 100% !important; }\r\n" + 
				"  .no-stack .col {\r\n" + 
				"    min-width: 0 !important;\r\n" + 
				"    display: table-cell !important; }\r\n" + 
				"  .no-stack.two-up .col {\r\n" + 
				"    width: 50% !important; }\r\n" + 
				"  .no-stack.mixed-two-up .col.num4 {\r\n" + 
				"    width: 33% !important; }\r\n" + 
				"  .no-stack.mixed-two-up .col.num8 {\r\n" + 
				"    width: 66% !important; }\r\n" + 
				"  .no-stack.three-up .col.num4 {\r\n" + 
				"    width: 33% !important; }\r\n" + 
				"  .no-stack.four-up .col.num3 {\r\n" + 
				"    width: 25% !important; }\r\n" + 
				"  .mobile_hide {\r\n" + 
				"    min-height: 0px;\r\n" + 
				"    max-height: 0px;\r\n" + 
				"    max-width: 0px;\r\n" + 
				"    display: none;\r\n" + 
				"    overflow: hidden;\r\n" + 
				"    font-size: 0px; } }\r\n" + 
				"\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #E3E8E5\">\r\n" + 
				"  <style type=\"text/css\" id=\"media-query-bodytag\">\r\n" + 
				"    @media (max-width: 520px) {\r\n" + 
				"      .block-grid {\r\n" + 
				"        min-width: 320px!important;\r\n" + 
				"        max-width: 100%!important;\r\n" + 
				"        width: 100%!important;\r\n" + 
				"        display: block!important;\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      .col {\r\n" + 
				"        min-width: 320px!important;\r\n" + 
				"        max-width: 100%!important;\r\n" + 
				"        width: 100%!important;\r\n" + 
				"        display: block!important;\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"        .col > div {\r\n" + 
				"          margin: 0 auto;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"      img.fullwidth {\r\n" + 
				"        max-width: 100%!important;\r\n" + 
				"      }\r\n" + 
				"			img.fullwidthOnMobile {\r\n" + 
				"        max-width: 100%!important;\r\n" + 
				"      }\r\n" + 
				"      .no-stack .col {\r\n" + 
				"				min-width: 0!important;\r\n" + 
				"				display: table-cell!important;\r\n" + 
				"			}\r\n" + 
				"			.no-stack.two-up .col {\r\n" + 
				"				width: 50%!important;\r\n" + 
				"			}\r\n" + 
				"			.no-stack.mixed-two-up .col.num4 {\r\n" + 
				"				width: 33%!important;\r\n" + 
				"			}\r\n" + 
				"			.no-stack.mixed-two-up .col.num8 {\r\n" + 
				"				width: 66%!important;\r\n" + 
				"			}\r\n" + 
				"			.no-stack.three-up .col.num4 {\r\n" + 
				"				width: 33%!important;\r\n" + 
				"			}\r\n" + 
				"			.no-stack.four-up .col.num3 {\r\n" + 
				"				width: 25%!important;\r\n" + 
				"			}\r\n" + 
				"      .mobile_hide {\r\n" + 
				"        min-height: 0px!important;\r\n" + 
				"        max-height: 0px!important;\r\n" + 
				"        max-width: 0px!important;\r\n" + 
				"        display: none!important;\r\n" + 
				"        overflow: hidden!important;\r\n" + 
				"        font-size: 0px!important;\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  </style>\r\n" + 
				"  <!--[if IE]><div class=\"ie-browser\"><![endif]-->\r\n" + 
				"  <!--[if mso]><div class=\"mso-container\"><![endif]-->\r\n" + 
				"  <table class=\"nl-container\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #E3E8E5;width: 100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n" + 
				"	<tbody>\r\n" + 
				"	<tr style=\"vertical-align: top\">\r\n" + 
				"		<td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\r\n" + 
				"    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #E3E8E5;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"    <div style=\"background-color:transparent;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    \r\n" + 
				"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider \" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"    <tbody>\r\n" + 
				"        <tr style=\"vertical-align: top\">\r\n" + 
				"            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 10px;padding-bottom: 10px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                    <tbody>\r\n" + 
				"                        <tr style=\"vertical-align: top\">\r\n" + 
				"                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                                <span></span>\r\n" + 
				"                            </td>\r\n" + 
				"                        </tr>\r\n" + 
				"                    </tbody>\r\n" + 
				"                </table>\r\n" + 
				"            </td>\r\n" + 
				"        </tr>\r\n" + 
				"    </tbody>\r\n" + 
				"</table>\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:transparent;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #84A8A5;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#84A8A5;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#84A8A5;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    \r\n" + 
				"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider \" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"    <tbody>\r\n" + 
				"        <tr style=\"vertical-align: top\">\r\n" + 
				"            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 0px;padding-left: 0px;padding-top: 0px;padding-bottom: 0px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                    <tbody>\r\n" + 
				"                        <tr style=\"vertical-align: top\">\r\n" + 
				"                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                                <span></span>\r\n" + 
				"                            </td>\r\n" + 
				"                        </tr>\r\n" + 
				"                    </tbody>\r\n" + 
				"                </table>\r\n" + 
				"            </td>\r\n" + 
				"        </tr>\r\n" + 
				"    </tbody>\r\n" + 
				"</table>\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:transparent;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #FFFFFF;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#FFFFFF;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#FFFFFF;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    &#160;\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:#E3E8E5;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #FFFFFF;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#FFFFFF;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#E3E8E5;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#FFFFFF;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    <div align=\"center\" class=\"img-container center  autowidth  fullwidth \" style=\"padding-right: 0px;  padding-left: 0px;\">\r\n" + 
				"<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr style=\"line-height:0px;line-height:0px;\"><td style=\"padding-right: 0px; padding-left: 0px;\" align=\"center\"><![endif]-->\r\n" + 
				"  <a href=\"http://help.beefree.io/hc/en-us/articles/115003159229\" target=\"_blank\">\r\n" + 
				"    <img class=\"center  autowidth  fullwidth\" align=\"center\" border=\"0\" src=\"https://i1.wp.com/techsauce.co/wp-content/uploads/2017/03/SCB-logo.jpg\" alt=\"Dynamic Image By Niftyimages\" title=\"Dynamic Image By Niftyimages\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;width: 100%;max-width: 600px\" width=\"600\">\r\n" + 
				"  </a>\r\n" + 
				"<!--[if mso]></td></tr></table><![endif]-->\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:#E3E8E5;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #FFFFFF;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#FFFFFF;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#E3E8E5;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#FFFFFF;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    <div class=\"\">\r\n" + 
				"	<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 30px; padding-left: 30px; padding-top: 30px; padding-bottom: 5px;\"><![endif]-->\r\n" + 
				"	<div style=\"line-height:150%;color:#555555;font-family:'Roboto', Tahoma, Verdana, Segoe, sans-serif; padding-right: 30px; padding-left: 30px; padding-top: 30px; padding-bottom: 5px;\">	\r\n" + 
				"		<div style=\"font-size:12px;line-height:18px;color:#555555;font-family:'Roboto', Tahoma, Verdana, Segoe, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><span style=\"font-size: 24px; line-height: 36px;\"><strong><span style=\"line-height: 36px; font-size: 24px;\"><span style=\"line-height: 36px; font-size: 24px;\">Hello </span></span></strong></span></p><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><span style=\"font-size: 18px; line-height: 27px;\"></span><span style=\"font-size: 18px; line-height: 27px;\">Please click the button to verify email</span></p></div>	\r\n" + 
				"	</div>\r\n" + 
				"	<!--[if mso]></td></tr></table><![endif]-->\r\n" + 
				"</div>\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:transparent;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #FFFFFF;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#FFFFFF;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#FFFFFF;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:15px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:15px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    \r\n" + 
				"<div align=\"center\" class=\"button-container center \" style=\"padding-right: 10px; padding-left: 10px; padding-top:10px; padding-bottom:20px;\">\r\n" + 
				"  <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-spacing: 0; border-collapse: collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top:10px; padding-bottom:20px;\" align=\"center\"><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\" "+link+" \" style=\"height:37pt; v-text-anchor:middle; width:106pt;\" arcsize=\"8%\" strokecolor=\"#E99D7F\" fillcolor=\"#E99D7F\"><w:anchorlock/><v:textbox inset=\"0,0,0,0\"><center style=\"color:#ffffff; font-family:'Roboto', Tahoma, Verdana, Segoe, sans-serif; font-size:20px;\"><![endif]-->\r\n" + 
				"    <a href=\" "+link+"\" target=\"_blank\" style=\"display: block;text-decoration: none;-webkit-text-size-adjust: none;text-align: center;color: #ffffff; background-color: #E99D7F; border-radius: 4px; -webkit-border-radius: 4px; -moz-border-radius: 4px; max-width: 142px; width: 102px;width: auto; border-top: 0px solid transparent; border-right: 0px solid transparent; border-bottom: 0px solid transparent; border-left: 0px solid transparent; padding-top: 5px; padding-right: 20px; padding-bottom: 5px; padding-left: 20px; font-family: 'Roboto', Tahoma, Verdana, Segoe, sans-serif;mso-border-alt: none\">\r\n" + 
				"      <span style=\"font-size:12px;line-height:24px;\"><span style=\"font-size: 20px; line-height: 40px;\" data-mce-style=\"font-size: 20px;\"><strong>Verify Now</strong></span></span>\r\n" + 
				"    </a>\r\n" + 
				"  <!--[if mso]></center></v:textbox></v:roundrect></td></tr></table><![endif]-->\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:transparent;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #84A8A5;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#84A8A5;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#84A8A5;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    <div class=\"\">\r\n" + 
				"	<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\r\n" + 
				"	<div style=\"line-height:120%;color:#FFFFFF;font-family:'Roboto', Tahoma, Verdana, Segoe, sans-serif; padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\">	\r\n" + 
				"		<div style=\"font-size:12px;line-height:14px;color:#FFFFFF;font-family:'Roboto', Tahoma, Verdana, Segoe, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><span style=\"font-size: 10px; line-height: 12px;\"><span style=\"line-height: 12px; font-size: 10px;\">You’re receiving this message because you signed up for&#160;our site account.</span></span></p></div>	\r\n" + 
				"	</div>\r\n" + 
				"	<!--[if mso]></td></tr></table><![endif]-->\r\n" + 
				"</div>\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:transparent;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    \r\n" + 
				"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider \" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"    <tbody>\r\n" + 
				"        <tr style=\"vertical-align: top\">\r\n" + 
				"            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 0px;padding-left: 0px;padding-top: 0px;padding-bottom: 0px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                    <tbody>\r\n" + 
				"                        <tr style=\"vertical-align: top\">\r\n" + 
				"                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                                <span></span>\r\n" + 
				"                            </td>\r\n" + 
				"                        </tr>\r\n" + 
				"                    </tbody>\r\n" + 
				"                </table>\r\n" + 
				"            </td>\r\n" + 
				"        </tr>\r\n" + 
				"    </tbody>\r\n" + 
				"</table>\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:transparent;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"598\" style=\" width:598px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 1px solid #84A8A5; border-left: 1px solid #84A8A5; border-bottom: 1px solid #84A8A5; border-right: 1px solid #84A8A5;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 1px solid #84A8A5; border-left: 1px solid #84A8A5; border-bottom: 1px solid #84A8A5; border-right: 1px solid #84A8A5; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    <div class=\"\">\r\n" + 
				"	<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 0px; padding-left: 0px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\r\n" + 
				"	<div style=\"line-height:150%;color:#84A8A5;font-family:'Roboto', Tahoma, Verdana, Segoe, sans-serif; padding-right: 0px; padding-left: 0px; padding-top: 10px; padding-bottom: 10px;\">	\r\n" + 
				"		<div style=\"font-size:12px;line-height:18px;color:#84A8A5;font-family:'Roboto', Tahoma, Verdana, Segoe, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><a style=\"color:#84A8A5;text-decoration: underline;\" href=\"http://help.beefree.io/hc/en-us/articles/115003159229\" target=\"_blank\" rel=\"noopener noreferrer\">DYNAMIC IMAGE SERVICE PROVIDED BY NIFTYIMAGES.COM</a><br><a style=\"color:#84A8A5;text-decoration: none;\" href=\"http://help.beefree.io/hc/en-us/articles/115003159229\" target=\"_blank\" rel=\"noopener noreferrer\">Click here to learn how to create dynamic images for countdown timers and personalized content</a></p></div>	\r\n" + 
				"	</div>\r\n" + 
				"	<!--[if mso]></td></tr></table><![endif]-->\r\n" + 
				"</div>\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>    <div style=\"background-color:transparent;\">\r\n" + 
				"      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\r\n" + 
				"        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\r\n" + 
				"          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\r\n" + 
				"\r\n" + 
				"              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:20px; padding-bottom:15px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
				"            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
				"              <div style=\"background-color: transparent; width: 100% !important;\">\r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:20px; padding-bottom:15px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\r\n" + 
				"\r\n" + 
				"                  \r\n" + 
				"                    \r\n" + 
				"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider \" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"    <tbody>\r\n" + 
				"        <tr style=\"vertical-align: top\">\r\n" + 
				"            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 0px;padding-left: 0px;padding-top: 0px;padding-bottom: 0px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                    <tbody>\r\n" + 
				"                        <tr style=\"vertical-align: top\">\r\n" + 
				"                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
				"                                <span></span>\r\n" + 
				"                            </td>\r\n" + 
				"                        </tr>\r\n" + 
				"                    </tbody>\r\n" + 
				"                </table>\r\n" + 
				"            </td>\r\n" + 
				"        </tr>\r\n" + 
				"    </tbody>\r\n" + 
				"</table>\r\n" + 
				"                  \r\n" + 
				"              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>   <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\r\n" + 
				"		</td>\r\n" + 
				"  </tr>\r\n" + 
				"  </tbody>\r\n" + 
				"  </table>\r\n" + 
				"  <!--[if (mso)|(IE)]></div><![endif]-->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</body></html>";
	return emailBody;	
	}

}
