/*
 * API Dispositivo - AsistEx FallDetector
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@asistex.es
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



import javax.validation.constraints.*;




/**
 * NivelBateria
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")
public class NivelBateria   {
  
    
      
  
  @JsonProperty("porcentaje")
  
  
  
  
  private double porcentaje = 0.0;
  

  
    
      
  
  @JsonProperty("tiempoRestante")
  
  
  
  
  private String tiempoRestante = null;
  

  public NivelBateria(double porcentaje, String tmpRest) {
    this.porcentaje = porcentaje;
    tiempoRestante = tmpRest;
  }
  
  
  public NivelBateria porcentaje(double porcentaje) {
    this.porcentaje = porcentaje;
    return this;
  }
  
  

  
  /**
  
  
   * Get porcentaje
  
  
  
   * @return porcentaje
   **/
 
  
  @JsonProperty("porcentaje")
  
  @ApiModelProperty(example = "80", value = "")

  public double getPorcentaje() {
    return porcentaje;
  }
  

  public void setPorcentaje(double porcentaje) {
    this.porcentaje = porcentaje;
  }
  

  
  
  public NivelBateria tiempoRestante(String tiempoRestante) {
    this.tiempoRestante = tiempoRestante;
    return this;
  }
  
  

  
  /**
  
  
   * Get tiempoRestante
  
  
  
   * @return tiempoRestante
   **/
 
  
  @JsonProperty("tiempoRestante")
  
  @ApiModelProperty(example = "5:30", value = "")

  public String getTiempoRestante() {
    return tiempoRestante;
  }
  

  public void setTiempoRestante(String tiempoRestante) {
    this.tiempoRestante = tiempoRestante;
  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NivelBateria nivelBateria = (NivelBateria) o;
    return Objects.equals(this.porcentaje, nivelBateria.porcentaje) &&
        Objects.equals(this.tiempoRestante, nivelBateria.tiempoRestante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(porcentaje, tiempoRestante);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NivelBateria {\n");
    
    sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("(%) \n");
    sb.append("    tiempoRestante: ").append(toIndentedString(tiempoRestante)).append("(h:m) \n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



