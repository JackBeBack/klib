package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DistributeSpacingVertical: ImageVector
    get() {
        if (_DistributeSpacingVertical != null) {
            return _DistributeSpacingVertical!!
        }
        _DistributeSpacingVertical = ImageVector.Builder(
            name = "DistributeSpacingVertical",
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
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                moveTo(3f, 20f)
                horizontalLineTo(21f)
                moveTo(7.6f, 15f)
                horizontalLineTo(16.4f)
                curveTo(16.96f, 15f, 17.24f, 15f, 17.454f, 14.891f)
                curveTo(17.642f, 14.795f, 17.795f, 14.642f, 17.891f, 14.454f)
                curveTo(18f, 14.24f, 18f, 13.96f, 18f, 13.4f)
                verticalLineTo(10.6f)
                curveTo(18f, 10.04f, 18f, 9.76f, 17.891f, 9.546f)
                curveTo(17.795f, 9.358f, 17.642f, 9.205f, 17.454f, 9.109f)
                curveTo(17.24f, 9f, 16.96f, 9f, 16.4f, 9f)
                horizontalLineTo(7.6f)
                curveTo(7.04f, 9f, 6.76f, 9f, 6.546f, 9.109f)
                curveTo(6.358f, 9.205f, 6.205f, 9.358f, 6.109f, 9.546f)
                curveTo(6f, 9.76f, 6f, 10.04f, 6f, 10.6f)
                verticalLineTo(13.4f)
                curveTo(6f, 13.96f, 6f, 14.24f, 6.109f, 14.454f)
                curveTo(6.205f, 14.642f, 6.358f, 14.795f, 6.546f, 14.891f)
                curveTo(6.76f, 15f, 7.04f, 15f, 7.6f, 15f)
                close()
            }
        }.build()

        return _DistributeSpacingVertical!!
    }

@Suppress("ObjectPropertyName")
private var _DistributeSpacingVertical: ImageVector? = null
