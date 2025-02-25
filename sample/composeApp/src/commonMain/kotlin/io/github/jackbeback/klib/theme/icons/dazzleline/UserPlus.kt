package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserPlus: ImageVector
    get() {
        if (_UserPlus != null) {
            return _UserPlus!!
        }
        _UserPlus = ImageVector.Builder(
            name = "UserPlus",
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
                moveTo(20f, 18f)
                lineTo(17f, 18f)
                moveTo(17f, 18f)
                lineTo(14f, 18f)
                moveTo(17f, 18f)
                verticalLineTo(15f)
                moveTo(17f, 18f)
                verticalLineTo(21f)
                moveTo(11f, 21f)
                horizontalLineTo(4f)
                curveTo(4f, 17.134f, 7.134f, 14f, 11f, 14f)
                curveTo(11.695f, 14f, 12.366f, 14.101f, 13f, 14.29f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserPlus!!
    }

@Suppress("ObjectPropertyName")
private var _UserPlus: ImageVector? = null
