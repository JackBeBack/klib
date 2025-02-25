package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiamondExclamation: ImageVector
    get() {
        if (_DiamondExclamation != null) {
            return _DiamondExclamation!!
        }
        _DiamondExclamation = ImageVector.Builder(
            name = "DiamondExclamation",
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
                moveTo(12f, 9f)
                verticalLineTo(12f)
                moveTo(12f, 15f)
                horizontalLineTo(12.01f)
                moveTo(3f, 12f)
                lineTo(12f, 3f)
                lineTo(21f, 12f)
                lineTo(12f, 21f)
                lineTo(3f, 12f)
                close()
            }
        }.build()

        return _DiamondExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondExclamation: ImageVector? = null
