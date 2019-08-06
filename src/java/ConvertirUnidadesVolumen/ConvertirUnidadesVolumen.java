/*
 * Copyright (C) 2019 Ingeniero en Computación: Ricardo Presilla.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ConvertirUnidadesVolumen;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 * Servicio web para la conversión de unidades de volumen.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
@WebService(serviceName = "ConvertirUnidadesVolumen")
@Stateless()
public class ConvertirUnidadesVolumen {


    /**
     * Web service para convertir galones a litros.
     * @param galones   Tipo duoble.
     * @return Regresa un double.
     */
    @WebMethod(operationName = "galonesALitros")
    public double galonesALitros(@WebParam(name = "galones") double galones) {
        return galones*3.7854;
    }

    /**
     * Web service para convertir litros a galones.
     * @param litros   Tipo duoble.
     * @return Regresa un double.
     */
    @WebMethod(operationName = "litrosAGalones")
    public double litrosAGalones(@WebParam(name = "litros") double litros) {
        return litros*0.26417;
    }
}
