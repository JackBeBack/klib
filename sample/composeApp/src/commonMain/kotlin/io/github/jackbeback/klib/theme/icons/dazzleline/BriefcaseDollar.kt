package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BriefcaseDollar: ImageVector
    get() {
        if (_BriefcaseDollar != null) {
            return _BriefcaseDollar!!
        }
        _BriefcaseDollar = ImageVector.Builder(
            name = "BriefcaseDollar",
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
                moveTo(16f, 7f)
                curveTo(16f, 6.07f, 16f, 5.605f, 15.898f, 5.224f)
                curveTo(15.62f, 4.188f, 14.812f, 3.38f, 13.776f, 3.102f)
                curveTo(13.395f, 3f, 12.93f, 3f, 12f, 3f)
                curveTo(11.07f, 3f, 10.605f, 3f, 10.224f, 3.102f)
                curveTo(9.188f, 3.38f, 8.38f, 4.188f, 8.102f, 5.224f)
                curveTo(8f, 5.605f, 8f, 6.07f, 8f, 7f)
                moveTo(14f, 11.5f)
                curveTo(13.5f, 11.376f, 12.685f, 11.371f, 12f, 11.376f)
                moveTo(12f, 11.376f)
                curveTo(11.771f, 11.377f, 11.909f, 11.368f, 11.6f, 11.376f)
                curveTo(10.793f, 11.401f, 10.002f, 11.737f, 10f, 12.688f)
                curveTo(9.998f, 13.7f, 11f, 14f, 12f, 14f)
                curveTo(13f, 14f, 14f, 14.231f, 14f, 15.313f)
                curveTo(14f, 16.125f, 13.193f, 16.481f, 12.186f, 16.599f)
                curveTo(11.386f, 16.599f, 11f, 16.625f, 10f, 16.5f)
                moveTo(12f, 11.376f)
                lineTo(12f, 10f)
                moveTo(12f, 16.6f)
                verticalLineTo(18f)
                moveTo(7.8f, 21f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 21f, 18.72f, 21f, 19.362f, 20.673f)
                curveTo(19.927f, 20.385f, 20.385f, 19.927f, 20.673f, 19.362f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineTo(11.8f)
                curveTo(21f, 10.12f, 21f, 9.28f, 20.673f, 8.638f)
                curveTo(20.385f, 8.074f, 19.927f, 7.615f, 19.362f, 7.327f)
                curveTo(18.72f, 7f, 17.88f, 7f, 16.2f, 7f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 7f, 5.28f, 7f, 4.638f, 7.327f)
                curveTo(4.074f, 7.615f, 3.615f, 8.074f, 3.327f, 8.638f)
                curveTo(3f, 9.28f, 3f, 10.12f, 3f, 11.8f)
                verticalLineTo(16.2f)
                curveTo(3f, 17.88f, 3f, 18.72f, 3.327f, 19.362f)
                curveTo(3.615f, 19.927f, 4.074f, 20.385f, 4.638f, 20.673f)
                curveTo(5.28f, 21f, 6.12f, 21f, 7.8f, 21f)
                close()
            }
        }.build()

        return _BriefcaseDollar!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseDollar: ImageVector? = null
