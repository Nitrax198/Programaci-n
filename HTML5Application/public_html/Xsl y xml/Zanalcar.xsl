<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : Zanalcar.xsl
    Created on : 5 de abril de 2018, 20:10
    Author     : Miguel
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/ZanalCar">
        <html>
            <head>
                <title>Zanalcar</title>
            </head>
            <body>
                <h1>Zanalcar</h1>
                <h2>Coches</h2>
                
                <table border="1">
                    <tr>
                        <th>Color</th>
                        <th>Marca</th>
                        <th>Precio de Compra</th>
                        <th>Precio de Venta</th>
                        <th>Matricula</th>
                        <th>Kilómetros</th>
                    </tr>
                    <xsl:for-each select="Vehiculos/coche">
                        <xsl:sort select="precioVenta"/>
                        <tr>
                            <td style="background:red" >
                                <xsl:value-of select="color"/>
                            </td>
                            <td>
                                <xsl:value-of select="marca"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioCompra"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioVenta"/>
                            </td>
                            <td>
                                <xsl:value-of select="matricula"/>
                            </td>
                            <td>
                                <xsl:value-of select="kilometraje"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h2>Motos</h2>
                <table border="1">
                    <tr>
                        <th>Color</th>
                        <th>Marca</th>
                        <th>Precio de Compra</th>
                        <th>Precio de Venta</th>
                        <th>Matricula</th>
                        <th>Kilómetros</th>
                    </tr>
                    <xsl:for-each select="Vehiculos/moto">
                        <xsl:sort select="precioVenta"/>
                        <tr>
                            <td style="background:pink">
                                <xsl:value-of select="color"/>
                            </td>
                            <td>
                                <xsl:value-of select="marca"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioCompra"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioVenta"/>
                            </td>
                            <td>
                                <xsl:value-of select="matricula"/>
                            </td>
                            <td>
                                <xsl:value-of select="kilometraje"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h2>Quad</h2>
                <table border="1">
                    <tr>
                        <th>Color</th>
                        <th>Marca</th>
                        <th>Precio de Compra</th>
                        <th>Precio de Venta</th>
                        <th>Matricula</th>
                        <th>Kilómetros</th>
                    </tr>
                    <xsl:for-each select="Vehiculos/quad">
                        <xsl:sort select="precioVenta"/>
                        <tr>
                            <td style="background:pink" >
                                <xsl:value-of select="color"/>
                            </td>
                            <td>
                                <xsl:value-of select="marca"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioCompra"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioVenta"/>
                            </td>
                            <td>
                                <xsl:value-of select="matricula"/>
                            </td>
                            <td>
                                <xsl:value-of select="kilometraje"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h2>Bicis</h2>
                <table border="1">
                    <tr>
                        <th>Color</th>
                        <th>Marca</th>
                        <th>Precio de Compra</th>
                        <th>Precio de Venta</th>
                        <th>Tamaño Ruedas</th>
                        <th>Numero de Marchas</th>
                        <th>Cambios</th>
                    </tr>
                    <xsl:for-each select="Vehiculos/bici">
                        <xsl:sort select="precioVenta"/>
                        <tr>
                            <td style="background:pink" >
                                <xsl:value-of select="color"/>
                            </td>
                            <td>
                                <xsl:value-of select="marca"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioCompra"/>
                            </td>
                            <td>
                                <xsl:value-of select="precioVenta"/>
                            </td>
                            <td>
                                <xsl:value-of select="tamañoRueda"/>
                            </td>
                            <td>
                                <xsl:value-of select="numeroMarchas"/>
                            </td>
                            <td>
                                <xsl:value-of select="tipoCambios"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
