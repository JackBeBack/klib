package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DistributeSpacingHorizontal: ImageVector
    get() {
        if (_DistributeSpacingHorizontal != null) {
            return _DistributeSpacingHorizontal!!
        }
        _DistributeSpacingHorizontal = ImageVector.Builder(
            name = "DistributeSpacingHorizontal",
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
                moveTo(4f, 3f)
                verticalLineTo(21f)
                moveTo(20f, 3f)
                verticalLineTo(21f)
                moveTo(10.6f, 18f)
                horizontalLineTo(13.4f)
                curveTo(13.96f, 18f, 14.24f, 18f, 14.454f, 17.891f)
                curveTo(14.642f, 17.795f, 14.795f, 17.642f, 14.891f, 17.454f)
                curveTo(15f, 17.24f, 15f, 16.96f, 15f, 16.4f)
                verticalLineTo(7.6f)
                curveTo(15f, 7.04f, 15f, 6.76f, 14.891f, 6.546f)
                curveTo(14.795f, 6.358f, 14.642f, 6.205f, 14.454f, 6.109f)
                curveTo(14.24f, 6f, 13.96f, 6f, 13.4f, 6f)
                horizontalLineTo(10.6f)
                curveTo(10.04f, 6f, 9.76f, 6f, 9.546f, 6.109f)
                curveTo(9.358f, 6.205f, 9.205f, 6.358f, 9.109f, 6.546f)
                curveTo(9f, 6.76f, 9f, 7.04f, 9f, 7.6f)
                verticalLineTo(16.4f)
                curveTo(9f, 16.96f, 9f, 17.24f, 9.109f, 17.454f)
                curveTo(9.205f, 17.642f, 9.358f, 17.795f, 9.546f, 17.891f)
                curveTo(9.76f, 18f, 10.04f, 18f, 10.6f, 18f)
                close()
            }
        }.build()

        return _DistributeSpacingHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _DistributeSpacingHorizontal: ImageVector? = null
