package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Tents: ImageVector
    get() {
        if (_Tents != null) {
            return _Tents!!
        }
        _Tents = ImageVector.Builder(
            name = "Tents",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.761f, 10f)
                lineTo(14.165f, 12.936f)
                curveTo(14.569f, 13.206f, 14.771f, 13.34f, 14.932f, 13.513f)
                curveTo(15.074f, 13.666f, 15.191f, 13.84f, 15.279f, 14.029f)
                curveTo(15.378f, 14.243f, 15.427f, 14.481f, 15.525f, 14.957f)
                lineTo(16.368f, 19.079f)
                curveTo(16.502f, 19.737f, 16.57f, 20.066f, 16.481f, 20.324f)
                curveTo(16.404f, 20.55f, 16.248f, 20.741f, 16.042f, 20.862f)
                curveTo(15.808f, 21f, 15.472f, 21f, 14.8f, 21f)
                horizontalLineTo(13.761f)
                moveTo(9.761f, 10f)
                lineTo(5.357f, 12.936f)
                curveTo(4.952f, 13.206f, 4.75f, 13.34f, 4.59f, 13.513f)
                curveTo(4.448f, 13.666f, 4.33f, 13.84f, 4.242f, 14.029f)
                curveTo(4.143f, 14.243f, 4.094f, 14.481f, 3.997f, 14.957f)
                lineTo(3.154f, 19.079f)
                curveTo(3.019f, 19.737f, 2.952f, 20.066f, 3.04f, 20.324f)
                curveTo(3.117f, 20.55f, 3.273f, 20.741f, 3.479f, 20.862f)
                curveTo(3.714f, 21f, 4.049f, 21f, 4.721f, 21f)
                horizontalLineTo(9.761f)
                moveTo(9.761f, 10f)
                verticalLineTo(15f)
                moveTo(9.761f, 21f)
                horizontalLineTo(13.761f)
                moveTo(9.761f, 21f)
                verticalLineTo(15f)
                moveTo(13.761f, 21f)
                lineTo(9.761f, 15f)
                moveTo(9.07f, 6.513f)
                curveTo(9.23f, 6.341f, 9.432f, 6.206f, 9.837f, 5.936f)
                lineTo(14.241f, 3f)
                lineTo(18.645f, 5.936f)
                curveTo(19.049f, 6.206f, 19.252f, 6.341f, 19.412f, 6.513f)
                curveTo(19.554f, 6.666f, 19.671f, 6.84f, 19.759f, 7.029f)
                curveTo(19.859f, 7.243f, 19.907f, 7.481f, 20.005f, 7.957f)
                lineTo(20.848f, 12.079f)
                curveTo(20.983f, 12.737f, 21.05f, 13.066f, 20.962f, 13.324f)
                curveTo(20.884f, 13.55f, 20.729f, 13.741f, 20.523f, 13.862f)
                curveTo(20.288f, 14f, 19.952f, 14f, 19.28f, 14f)
            }
        }.build()

        return _Tents!!
    }

@Suppress("ObjectPropertyName")
private var _Tents: ImageVector? = null
