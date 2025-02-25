package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ShieldSlashAlt: ImageVector
    get() {
        if (_ShieldSlashAlt != null) {
            return _ShieldSlashAlt!!
        }
        _ShieldSlashAlt = ImageVector.Builder(
            name = "ShieldSlashAlt",
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
                moveTo(10.132f, 4.527f)
                curveTo(10.798f, 4.103f, 11.422f, 3.592f, 12f, 3f)
                curveTo(13.887f, 4.935f, 16.268f, 6f, 19f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(9.166f)
                curveTo(20f, 10.751f, 19.737f, 12.265f, 19.257f, 13.655f)
                moveTo(17.297f, 17.296f)
                curveTo(15.911f, 19.075f, 14.078f, 20.387f, 12f, 21f)
                curveTo(7.399f, 19.644f, 4f, 14.86f, 4f, 9.166f)
                lineTo(4f, 6f)
                horizontalLineTo(5f)
                curveTo(5.324f, 6f, 5.643f, 5.985f, 5.957f, 5.955f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _ShieldSlashAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSlashAlt: ImageVector? = null
