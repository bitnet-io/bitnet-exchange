/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.common.app;

import lombok.extern.slf4j.Slf4j;

/*
@Slf4j
public class AsciiLogo {
    public static void showAsciiLogo() {
        String ls = System.lineSeparator();
        log.info(ls + ls +
                "                    ........                  ......                                                                         " + ls +
                "                ..............                ......                                                                         " + ls +
                "              .................               ......                                                                         " + ls +
                "            ......   ..........   ..          ......                                                                         " + ls +
                "           ......      ......   ......        ...............        .....     .........         ..........                  " + ls +
                "          .......              ........       ..................     .....   .............     ...............               " + ls +
                "          ......               ........       ..........  .......    .....  ......   ...     ........   .......              " + ls +
                "         ......                   .....       .......        .....   .....  .....            .....        ......             " + ls +
                "         ......    ...        ...             ......         ......  .....   ...........    ......         ......            " + ls +
                "         ......   .....      ....             ......         ......  .....    ............  .....          ......            " + ls +
                "          ......                               .....         ......  .....         ........ ......         ......            " + ls +
                "           ......       ....        ...        ......       ......   .....    ..     ......  ......      ........            " + ls +
                "            ........     ..      .......        .................    .....  ..............    ...................            " + ls +
                "             ..........       .........           .............      .....   ............       .................            " + ls +
                "               ......................                 .....                      ....               ....   ......            " + ls +
                "                  ................                                                                         ......            " + ls +
                "                        ....                                                                               ......            " + ls +
                "                                                                                                           ......            " + ls +
                ls + ls);
    }
}
*/



@Slf4j
public class AsciiLogo {
    public static void showAsciiLogo() {
        String ls = System.lineSeparator();

log.info(ls + ls + ls + ls +

  "  MMMMMMMMMMMMMMMMMMMMMWNKkoc,..               .';lx0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMMMMMMMNKd:.                          .,lOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMMMMWXx:.                                .,o0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMMWKd,.                                     .cONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMWXx,                   .:;'.                  .lKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMW0:.                   .dNNk,.:do;.              ,kNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMNx,              'llc;'.cKWNd.;0WNd.               .oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMNd.              .oXWWNXKXWMNkokNWK:                 .lXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMNx.                'cd0NMMMMMMWWWMWXd:.                .oNMMMMMNXKKKKKKKKKKKXNWMMMMNOdddddONMMMWWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWWWWWMMMMNXKKKKKNWMMMMWXKKKKKXWMMMMMMMMMMMM  " + ls +
  "  MMMMMMMWO'                   .lXMMMWXOO0XNWMWNKkc.              .kWMMMWkccccccccccccclxKMMMKl:::::oXMMW0oooodKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXxoooodKMMMW0occccclONMWNklcccccdXMMMMMMMMMMMM  " + ls +
  "  MMMMMMMXc                    .xNMMMNd...':xXWMMMNx'              :KMMMWk:::::ldoc::::::xNMMKo::c::dXWWWk::::c0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKl::::cOWMMMNKd:::::cxXKdc::::cxKWMMMMMMMMMMMM  " + ls +
  "  MMMMMMWO'                    :KWMMW0,     .dNMMMWKc              .kWMMWk:::::dXNKxc::::cxNMXdlllllkKX0ko:::::dkkk0NXOkkkkkkkkkkkkOKWMMMMMWKOkkkkkkkOKNMMXOdc:::::okkk0NWXxl::::col:::::ckNMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMNd.                   .xNMMMWO:.....:OWMMMW0:              .oNMMWk:::::o0K0xc::::ckNMKl:::::d00d:::::::::::oKOc:::::::::::::ckNMMN0dc:::::::::cd0WO:::::::;::::oXMMNOl::::::::::o0WMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMXl                    :0WMMMMWNXK00KNWMMWN0c.               cXMMWk::::::cc::::::ckWMMKl:::::dKX0xl::::cokkk0NOc:::::::cc:::::l0WNkc:::::lolc::::lO0kdc:::::okkkONMMMW0l::::::::oKMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMXc                   .oNMMMN0xk0XNWMMMMWXx;.                cXMMWk::::::clc:::::cdKWMKl:::::oXWMWk::::cOWMMMWOc:::::lOK0d:::::o0kc:::::lkOko:::::oXWKl::::cOWMMMMMMMWKd::::::::dKWMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMNo.                  ,OWMMW0;  .';oONMMMWKo.               .lXMMWk:::::o0XKOl:::::l0WKl:::::dXWMWk::::c0WMMMM0c:::::xNMW0c::::cOx::::::::::::::::l0WKl::::cOMMMMMMMWOl::::::::::o0WMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMWx.              .'.,xNMMMNo.      .dNMMMWXo.              .dNMMWk:::::dXWWXx::::::kWKl:::::dXMMWk::::cONWMMW0c:::::xNMM0l::::lOkc::::clloolllc::l0WKl::::cOWWMMMMXxc:::::lc:::::ckNMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMM0;            .:0XKXNMMMMKc.      'xNMMMMNd.              ,0WMMWk:::::ldxolc:::::l0WKl:::::dXWMWk:::::codxONOc:::::xNMM0l::::lONkc::::cloolllc::oXMKl:::::cdxxONKd:::::cxX0o:::::cxXMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMNd.           .o0XNWWMMMMWKOkdoodkKNMMMMW0:              .oNMMMWk::::::::::::::lxKWMKl:::::oXMMWKo::::::::oKOc:::::xNMM0l::::c0WN0xl::::::::::::xNMNkc::::::::cdo:::::lOXMWXkc:::::o0WMMMMMMMMMMM  " + ls +
  "  MMMMMMMMKc            ..';cxXMMWNNWMMMMWMMMMMWNO:.              cKWMMMWXOOOOOOOOOOOOO0XWMMMN0OOOOOKWMMMMN0OOOOOOO0NXOOOOOOKWMMN0OOOO0NMMMWX0OOOOOOOOOO0NMMMWKOOOOOOOOOOOOOOOOKWMMMMN0OOOOOOKWMMMMMMMMMMM  " + ls +
  "  MMMMMMMMW0:                :KWNkcoKWWX0KKKKKOxc.               ;0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMW0:              .oNW0:.cKWKl.......                 ;OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMWKl.             ,lo:..oKNx.                      .cKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMNk,                  .;;.                      ,xXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMWKo'                                        'oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMMMWKd,.                                  .,oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMMMMMWXOl'.                            .'ckXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMMMMMMMMWXOo:'.                    .':okXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMMMMMMMMMMMWNX0xoc;,'........',;coxOXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +
  "  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXKK0000KKXNNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  " + ls +

ls + ls);

    }
}









/*"    MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKM  " + ls +
"    MMMWNNNNNNNNNNNNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKdo:'''XMMMMMMN0KWMMMMMMMMMMMMMMMMMMMMMMMMMMMNXXXXXXXXXXNMMMMMNXXXXXXXNMMKM  " + ls +
"    MMMOol;    ;;;;;;,...,l0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMk   0MMMMMo   ,MMMMMMMMMMMMMMMMMMMMMMMMMMMOdo;    .od0MMMMWkd;  ,odkMMKM  " + ls +
"    MMMMMM0   'MMMMMMMMXc   ;NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMk   0MMMMMWkodXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0,   '0MMMMMMXc 'OMMMMMMKM  " + ls +
"    MMMMMM0   'MMMMMMMMMM'   xMMMMMMMMMMMWNNNWMMMMMMMMMMMMMMWNXXXNNk   0MMMMMMMMMMMMMMMMMMMMMWNXXXNMMMMMMMMMMMMMMMMO.   cNMMXl 'OMMMMMMMMKM  " + ls +
"    MMMMMM0   'MMMMMMMMMW.   0MMMMMMMK..;:llc. .cXMMMMMMXo,..;clllc,   0MMMKxo.  :MMMMMMMKl'.,cllc;..;kWMMMMMMMMMMMMWo   .ol 'kMMMMMMMMMMKM  " + ls +
"    MMMMMM0   'MMMMMMWXx.  ;KMMMMMMMMK'0MMMMMM,  ,MMMMMx   dMMMMMMMk   0MMMMMM,  ,MMMMMWc  ,NMMMMMMWo  .0MMMMMMMMMMMMMNl    cMMMMMMMMMMMMKM  " + ls +
"    MMMMMM0    ;;;;,.   cxXMMMMMMMMMMMMMMMMMMM:  .MMMM0   oMMMMMMMMk   0MMMMMM,  ,MMMMMl   KMMMMMMMMM,  .WMMMMMMMMMMMMNl .   'OMMMMMMMMMMKM  " + ls +
"    MMMMMM0   'MMMMMO.  .dWMMMMMMMMMWkc,,:cccc.  .MMMMl   KMMMMMMMMk   0MMMMMM,  ,MMMMM,  .WMMMMMMMMMc   0MMMMMMMMMMNc .OM0'   ;XMMMMMMMMKM  " + ls +
"    MMMMMM0   'MMMMMMWo   .OMMMMMMMX.  oWMMMMM:  .MMMMo   OMMMMMMMMk   0MMMMMM,  ,MMMMM:   XMMMMMMMMM:   XMMMMMMMMNl 'OMMMMWx.   cXMMMMMMKM  " + ls +
"    MMMMMM0   'MMMMMMMMX;   ,KMMMMMx   XMMMMMM:  .MMMMN.  .XMMMMMMMk   0MMMMMM,  ,MMMMMK.  oMMMMMMMMK   lMMMMMMMNl .OMMMMMMMMWd    dWMMMMKM  " + ls +
"    MMMMWNx   .XNWMMMMMMMO.   lKNWMN'  .dkOkdl'  .NWMMMX;   cxO0Okx:   OWMMMWN'  'NWMMMMNc  ;kXNWXOl. 'kMMMMWXKo. lXWMMMMMMMMMNO.   .kKNWKM  " + ls +
"    MMNOlclcllllcldNNNNNNNXocllcloXNNxl:::clxXKlllloKNNNNKxl::::cokKolllo0NdollllllodXNNNNXkoc::::clxKNNNNNXollllllldNNNNNNNNkllllllllllkKM  " + ls +
"    MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKM  " + ls +
"    MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKM  " + ls +
  ls + ls);

    }
}
*/






/*

"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0OOOOOOOXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKMM      " + ls +
"	MMMMNXXXXXXXXXXXXXXXXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWxoc:    oMMMMMMMMNkxOWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKKKKKKKKKKKKKKNMMMMMMXKKKKKKKKKKXMMKMM      " + ls +
"	MMMWl;'.                .':o0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.   oMMMMMMMO.   .NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWl;,.      .';:OMMMMMMd:;'.   .,:oWMKMM      " + ls +
"	MMMMMMMMx    'NNNNNNXKOd:    .oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.   oMMMMMMMO.   .NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMK'    .OMMMMMMMMMMMWl  ,KMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMMMK.    cMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.   oMMMMMMMMNkxOWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWc     cWMMMMMMMMK'  oWMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMMMM0     KMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.   oMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMx     ,XMMMMMWc  ;KMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMMMMW.    OMMMMMMMMMMMMNX0OOkO0KWMMMMMMMMMMMMMMMMN0kxxxkk0K.   oMMMMMWNNNNNNWMMMMMMMMMMMMMWXOkxxxk0XWMMMMMMMMMMMMMMMMMMMX,    .kMMMK.  dMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMMMMX.    XMMMMMMMMMW,.  .',,'   .oNMMMMMMMMMNx;.  .',,,,'.    oMMMMMo:,.   .WMMMMMMMMMXo,. .',;,.  .,oXMMMMMMMMMMMMMMMMMWl     cXl  :XMMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMMMW:    oMMMMMMMMMMN. lNMMMMMN;   .KMMMMMMMO.   :0MMMMMMMM.   oMMMMMMMMd   .WMMMMMMMMd   'OWMMMMMNx.   oWMMMMMMMMMMMMMMMMM0.       xMMMMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMNk,   .dWMMMMMMMMMMW;;WMMMMMMMK    oMMMMMMk    kMMMMMMMMMM.   oMMMMMMMMd   .WMMMMMMW:   .NMMMMMMMMMX.   cMMMMMMMMMMMMMMMMMMN;     cWMMMMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    .::::::;'.    ,xWMMMMMMMMMMMMMMMMMMMMMMMN.   cMMMMMN.   :MMMMMMMMMMM.   oMMMMMMMMd   .WMMMMMMd    xMMMMMMMMMMMx    kMMMMMMMMMMMMMMMMMMO      :NMMMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    .cccccc.    :NMMMMMMMMMMMMMMMMMMMMMMMMMMN.   cMMMMMo    kMMMMMMMMMMM.   oMMMMMMMMd   .WMMMMMM'    XMMMMMMMMMMMX    ,MMMMMMMMMMMMMMMMNl  :.    .0MMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMN;    '0MMMMMMMMMMMMMMXxc,........    cMMMMM;    KMMMMMMMMMMM.   oMMMMMMMMd   .WMMMMMW.   .NMMMMMMMMMMMW.   .NMMMMMMMMMMMMMWx. .0MWc     cWMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMWx     kMMMMMMMMMMMMo   .xKNMMMMN.   cMMMMM,    KMMMMMMMMMMM.   oMMMMMMMMd   .WMMMMMW.   .NMMMMMMMMMMMW.   .NMMMMMMMMMMMMN;  cWMMMMO.    'XMMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMM0.    :XMMMMMMMMMd   .XMMMMMMMN.   cMMMMMc    kMMMMMMMMMMM.   oMMMMMMMMd   .WMMMMMM,    KMMMMMMMMMMMX    ,MMMMMMMMMMMWd. '0MMMMMMMX,     dMMMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMMX'    .0MMMMMMMM,   ,MMMMMMMMN.   cMMMMM0    :MMMMMMMMMMM.   oMMMMMMMMd   .WMMMMMMd    xMMMMMMMMMMMx    kMMMMMMMMMMX,  lWMMMMMMMMMWl     :WMMMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMMMWl     xMMMMMMM;   .NMMMMMMMN.   cMMMMMMc    dMMMMMMMMMM.   oMMMMMMMMd   .WMMMMMMW:   .NMMMMMMMMMX.   lMMMMMMMMMWd. ,KMMMMMMMMMMMMMO.    '0MMMMMKMM      " + ls +
"	MMMMMMMMx    ,MMMMMMMMMMMMMO.    ;XMMMMM0    ,OXNXKOo;    cMMMMMMWc    'dKNWWWX0x.   oMMMMMMMMd   .WMMMMMMMMd   .OWMMMMMNd.   oWMMMMMMMMX'  oWMMMMMMMMMMMMMMMN;     oMMMMKMM      " + ls +
"	MMMMk:;'.     .',:oWMMMMMMMMK'     ',:0MM0'        .c0l   .;cOMMMMMOc.         'l,   .,:OMOc;,.    ';:lNMMMMMXo,. .';;,.  .,oXMMMMMMk;'.    .',lWMMMMMMMMMO;,..      ..,:kMM      " + ls +
"	MMWNKOOO0OOOOOOOOO0XNNNNNNNNNX0OOOOO0OKNNNNKOxxxxOKXNNX000000KNNNNNNNNKkkxxxx0XNNK000000KNK000000000000XNNNNNNNNX0kxxdxxO0XNNNNNNNNNK0000000000KNNNNNNNNNNX00000000000000OMM      " + ls +
"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKMM      " + ls +
"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKMM      " + ls +
*/
