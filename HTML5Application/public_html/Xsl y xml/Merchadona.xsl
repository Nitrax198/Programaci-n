<?xml version="1.0"?>

<!--
    Document   : Merchadona.xsl
    Created on : 5 de abril de 2018, 19:19
    Author     : Miguel
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/Merchadona">
        <html>
            <head>
                <title>Merchadona</title>
            </head>
            <body>
                <h1>Merchadona</h1>
                <h2>Empleados</h2>
                <h3>Cajeros</h3>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <th> ID </th>
                        <th>Precio Total</th>
                    </tr>
                    <xsl:for-each select="Empleados/Cajero">
                        <xsl:sort select="precioTotal"/>
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="id"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioTotal"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h3>Reponedores</h3>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <th> ID </th>
                        <th>Total repuestos</th>
                    </tr>
                    <xsl:for-each select="Empleados/Reponedor">
                        <xsl:sort select="nombre"/>
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="id"/>
                            </td>
                            <td>
                                <xsl:value-of select="totalRepuestos"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h2>Productos</h2>
                <h3>Imperecederos</h3>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <th>Precio Base</th>
                        <th>Stock</th>
                    </tr>
                    <xsl:for-each select="Productos/Imperecedero">
                        <xsl:sort select="nombre"/>
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioBase"/>
                            </td>
                            <td>
                                <xsl:value-of select="stock"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h3>Perecederos</h3>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <th>Precio Base</th>
                        <th>Stock</th>
                        <th>Fecha Reposición</th>
                    </tr>
                    <xsl:for-each select="Productos/Perecedero">
                        <xsl:sort select="nombre"/>
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioBase"/>
                            </td>
                            <td>
                                <xsl:value-of select="stock"/>
                            </td>
                            <td style="background:green" >
                                <xsl:value-of select="fechaReposicion"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
