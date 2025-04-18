package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SearchPlus: ImageVector
    get() {
        if (_SearchPlus != null) {
            return _SearchPlus!!
        }
        _SearchPlus = ImageVector.Builder(
            name = "SearchPlus",
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
                moveTo(15.805f, 15.801f)
                lineTo(21f, 21f)
                moveTo(10.5f, 7.5f)
                verticalLineTo(13.5f)
                moveTo(7.5f, 10.5f)
                horizontalLineTo(13.5f)
                moveTo(18f, 10.5f)
                curveTo(18f, 14.642f, 14.642f, 18f, 10.5f, 18f)
                curveTo(6.358f, 18f, 3f, 14.642f, 3f, 10.5f)
                curveTo(3f, 6.358f, 6.358f, 3f, 10.5f, 3f)
                curveTo(14.642f, 3f, 18f, 6.358f, 18f, 10.5f)
                close()
            }
        }.build()

        return _SearchPlus!!
    }

@Suppress("ObjectPropertyName")
private var _SearchPlus: ImageVector? = null
