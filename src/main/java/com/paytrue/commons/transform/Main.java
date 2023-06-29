package com.paytrue.commons.transform;

import org.apache.camel.Exchange;

public class Main {
    public static void main(String[] args) {
        System.out.println("ENTRE A RAWTEXTPROCESSOR \n");
        RawTextProcessor rawTextProcessor = new RawTextProcessor();
        String mesan = rawTextProcessor.process("<DATOSOUT><Canal>000</Canal><Identificador>00000" +
                "</Identificador><Pais>000</Pais><TipoDocumento>1</TipoDocumento><NroDocumento>00000000" +
                "</NroDocumento><Tarjetas><Tarjeta><NroTarjeta>5254863488355846</NroTarjeta><Sucursal>00" +
                "</Sucursal><TipoTarjeta>00</TipoTarjeta><FechaAlta>000000</FechaAlta><FechaVto>000000" +
                "</FechaVto><FechaUltUso>0</FechaUltUso><CCEmpresa>1</CCEmpresa><CCSucursal>00</CCSucursal>" +
                "<CCModulo>00</CCModulo><CCCuenta>000000000</CCCuenta><CCOperacion>0</CCOperacion><CCSubOp>" +
                "1</CCSubOp><CCMoneda>0</CCMoneda><CCPapel>0</CCPapel><Nombre>PRUEBA1</Nombre><GAF>000</GAF>" +
                "<EstadoPlastico>A EMITIR</EstadoPlastico><SituacionActual>INACTIVA</SituacionActual><EstadoTarjeta>AC" +
                "</EstadoTarjeta><MotivoCancelacion/><FechaCancelacion>0</FechaCancelacion><Cuentas><Cuenta>" +
                "<Empresa>00</Empresa><Sucursal>00</Sucursal><Modulo>00</Modulo><NroCuenta>000000000</NroCuenta>" +
                "<Operacion>0</Operacion><SubOp>6</SubOp><Moneda>0</Moneda><Papel>0</Papel><TipoCuenta>PREFERENCIAL LOCAL" +
                "</TipoCuenta></Cuenta></Cuentas><CuentasPJ>N</CuentasPJ><Courier/><CodigoCourier/><EstadoCourier/>" +
                "</Tarjeta></Tarjetas></DATOSOUT>", "HTML4");
        System.out.println(mesan);

    }
}
