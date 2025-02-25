package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserCheck: ImageVector
    get() {
        if (_UserCheck != null) {
            return _UserCheck!!
        }
        _UserCheck = ImageVector.Builder(
            name = "UserCheck",
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
                moveTo(15f, 15.255f)
                curveTo(13.866f, 14.464f, 12.487f, 14f, 11f, 14f)
                curveTo(7.404f, 14f, 4.441f, 16.711f, 4.045f, 20.201f)
                curveTo(4.017f, 20.448f, 4.003f, 20.572f, 4.052f, 20.691f)
                curveTo(4.093f, 20.789f, 4.18f, 20.886f, 4.272f, 20.938f)
                curveTo(4.385f, 21f, 4.523f, 21f, 4.8f, 21f)
                horizontalLineTo(9.945f)
                moveTo(14f, 19.286f)
                lineTo(15.8f, 21f)
                lineTo(20f, 17f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserCheck!!
    }

@Suppress("ObjectPropertyName")
private var _UserCheck: ImageVector? = null
