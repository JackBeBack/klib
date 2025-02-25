package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Enter: ImageVector
    get() {
        if (_Enter != null) {
            return _Enter!!
        }
        _Enter = ImageVector.Builder(
            name = "Enter",
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
                moveTo(20f, 7f)
                verticalLineTo(8.2f)
                curveTo(20f, 9.88f, 20f, 10.72f, 19.673f, 11.362f)
                curveTo(19.385f, 11.927f, 18.927f, 12.385f, 18.362f, 12.673f)
                curveTo(17.72f, 13f, 16.88f, 13f, 15.2f, 13f)
                horizontalLineTo(4f)
                moveTo(4f, 13f)
                lineTo(8f, 9f)
                moveTo(4f, 13f)
                lineTo(8f, 17f)
            }
        }.build()

        return _Enter!!
    }

@Suppress("ObjectPropertyName")
private var _Enter: ImageVector? = null
