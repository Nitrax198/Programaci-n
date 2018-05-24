<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : LeonesYtigres.xsl
    Created on : 24 de mayo de 2018, 8:46
    Author     : daw
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/zoo">
        <html>
            <head>
                <title>LeonesYtigres</title>
            </head>
            <body>
                <h1>Zoo</h1>
                <h2>Animales</h2>
                <h3>Leones</h3>
                <h4>Leon</h4>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <th> peso </th>
                        <th>enfermo</th>
                    </tr>
                    <xsl:for-each select="animales/leones/leon">
                        <xsl:sort select="peso"/>
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="peso"/>
                            </td>
                            <td style="background:red">
                                <xsl:value-of select="enfermo"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h3>Tigres</h3>
                <h4>Tigre</h4>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <th>peso </th>
                        <th>Numero de Rayas </th>
                        <th>enfermo</th>
                    </tr>
                    <xsl:for-each select="animales/tigres/tigre">
                        <xsl:sort select="nombre"/>
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="peso"/>
                            </td>
                            <td>
                                <xsl:value-of select="numero_rayas"/>
                            </td>
                            <td style="background:red">
                                <xsl:value-of select="enfermo"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
