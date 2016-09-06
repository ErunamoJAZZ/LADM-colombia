package co.ctzen.ldam

import co.ctzen.domain.SurveyingDomain._
import co.ctzen.domain.types._

/**
  * Created by jvallejo on 6/09/16.
  */
case class
La_BoundaryFace(
                  bfID: Oid,
                  colindante: Seq[Int], // TODO obligatorio que existe al menos uno
                  distancia: Int,
                  geometry: Option[GM_MultiSurface],
                  locationByText: Option[String],
                  otrasEstructuras: COL_OtrasEsctructurasTipo,
                  viaTipo: COL_ViaTipo,
                  plusSpatialUnit: Seq[LA_SpatialUnit], // Asociación con LA_SpatialUnit 0..* TODO revisar nombre
                  minusSpatialUnit: Seq[LA_SpatialUnit], // Asociación con LA_SpatialUnit 0..* TODO revisar nombre
                  source: Seq[COL_SpatialSource], // Asociación con COL_SpatialSource 0..*
                  point: Seq[COL_Point] // Asociación con COL_Point  TODO realizar la siguiente verificación de cardinalidad 0,3..* y ordered
                )

// Abstract para evitar conflictos en el momento
abstract class
COL_Point(
            acuerdo:COL_AcuerdoTipo, // TODO revisar = acuerdo ??
            defPunto: COL_DefPuntoTipo, // TODO revisar = bienIdentificable ??
            descripcion: COL_Descripcion,
            exactitudPosicional: DQ_Element,
            exactitudVertical: Option[DQ_Element],
            fuente: COL_FuenteTipo,
            interpolacion: COL_InterpolacionTipo,
            localizacionOriginal: GM_Point,
            nombrePunto: Option[String], // TODO revisar si el tipo y la cardinalidad es correcto
            pID: Oid,
            pointType: COL_PointTipo, // TODO revisar = verticeTerreno ??
            productionMethod: Option[LI_Lineage],
            senialamiento: Option[COL_MonumentacionTipo],
            transformacion: Seq[LA_Transformation],
            boundaryFaceString: Seq[LA_BoundaryFaceString], // Asociación con LA_BoundaryFaceString 0..*
            source: Seq[COL_SpatialSource], // Asociación con SpatialSource 0..*
            boundaryFace: Seq[La_BoundaryFace], // Asociación con LA_BoundaryFace 0..*
            spatialUnit: Option[LA_SpatialUnit] // Asociacón con LA_SpatialUnit 0..1
) {
  def getTransResult: GM_Point
}

case class
LA_BoundaryFaceString(
                        bfsID: Oid,
                        geometry: Option[GM_MultiCurve],
                        locationByText: Option[String],
                        source: Seq[COL_SpatialSource], // Asociación con SpatialSource
                        point: Seq[COL_Point], // Asociación con COL_Point. TODO se debe realizar esta verificacion de cardinalidad 0,2..* y el ordered
                        plusSpatialUnit: Seq[LA_SpatialUnit], // Asociación con LA_SpatialUnit TODO revisar nombre
                        minusSpatialUnit: Seq[LA_SpatialUnit] // Asociación con LA_SpatialUnit TODO revisar nombre
                      )

case class
COL_Polygon(
              bfsID: Oid,
              geometry: Option[GM_MultiCurve],
              locationByText: Option[String],
              spatialUnit: Seq[LA_SpatialUnit], // Asociación de Spatial Unit
              source: Seq[COL_SpatialSource] // Asociación con SpatialSource
            )
