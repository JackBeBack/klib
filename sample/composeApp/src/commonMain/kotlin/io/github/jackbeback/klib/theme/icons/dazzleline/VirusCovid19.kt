package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.VirusCovid19: ImageVector
    get() {
        if (_VirusCovid19 != null) {
            return _VirusCovid19!!
        }
        _VirusCovid19 = ImageVector.Builder(
            name = "VirusCovid19",
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
                moveTo(18f, 12f)
                curveTo(18f, 15.314f, 15.314f, 18f, 12f, 18f)
                moveTo(18f, 12f)
                curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
                moveTo(18f, 12f)
                horizontalLineTo(21f)
                moveTo(12f, 18f)
                curveTo(8.686f, 18f, 6f, 15.314f, 6f, 12f)
                moveTo(12f, 18f)
                verticalLineTo(21f)
                moveTo(6f, 12f)
                curveTo(6f, 8.686f, 8.686f, 6f, 12f, 6f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveTo(12f, 6f)
                verticalLineTo(3f)
                moveTo(21f, 10.5f)
                verticalLineTo(13.5f)
                moveTo(3f, 10.5f)
                verticalLineTo(13.5f)
                moveTo(10.5f, 3f)
                horizontalLineTo(13.5f)
                moveTo(10.5f, 21f)
                horizontalLineTo(13.5f)
                moveTo(17.304f, 4.575f)
                lineTo(19.425f, 6.697f)
                moveTo(4.575f, 17.304f)
                lineTo(6.697f, 19.425f)
                moveTo(18.364f, 5.636f)
                lineTo(16.243f, 7.757f)
                moveTo(7.758f, 16.242f)
                lineTo(5.636f, 18.364f)
                moveTo(4.575f, 6.696f)
                lineTo(6.697f, 4.575f)
                moveTo(17.304f, 19.425f)
                lineTo(19.425f, 17.303f)
                moveTo(5.636f, 5.636f)
                lineTo(7.757f, 7.757f)
                moveTo(16.242f, 16.242f)
                lineTo(18.364f, 18.364f)
                moveTo(14f, 14f)
                horizontalLineTo(14.01f)
                moveTo(10.5f, 11.5f)
                horizontalLineTo(10.51f)
                moveTo(11.5f, 11.5f)
                curveTo(11.5f, 12.052f, 11.052f, 12.5f, 10.5f, 12.5f)
                curveTo(9.948f, 12.5f, 9.5f, 12.052f, 9.5f, 11.5f)
                curveTo(9.5f, 10.948f, 9.948f, 10.5f, 10.5f, 10.5f)
                curveTo(11.052f, 10.5f, 11.5f, 10.948f, 11.5f, 11.5f)
                close()
            }
        }.build()

        return _VirusCovid19!!
    }

@Suppress("ObjectPropertyName")
private var _VirusCovid19: ImageVector? = null
